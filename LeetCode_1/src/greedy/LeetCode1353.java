package greedy;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author: Dennis
 * @date: 2020/8/4 10:37
 */

public class LeetCode1353 {
    public static int maxEvents(int[][] events) {
        //首先排序：开始时间小的在前。这样是方便我们顺序遍历，把开始时间一样的都放进堆
        Arrays.sort(events, (start, end) -> start[0] - end[0]);
        //小顶堆
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 优先队列头部是最小值
        //结果、开始时间、events下标、有多少组数据
        int res = 0, last = 1, i = 0;
        while (i < events.length || !pq.isEmpty()) {
            //将start相同的会议都放进堆里
            while (i < events.length && events[i][0] == last) {
                pq.offer(events[i++][1]);
            }
            //pop掉当前天数之前的
            while (!pq.isEmpty() && pq.peek() < last) {
                pq.poll();
            }
            //顶上的就是俺们要参加的
            if (!pq.isEmpty()) {
                pq.poll();
                res++;
            }
            last++;  // 当前天数 +1
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] events = {{1,2},{1,3},{2,3},{3,4},{1,4}};
        maxEvents(events);
    }
}
