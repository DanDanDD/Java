package queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: Dennis
 * @date: 2020/7/27 17:45
 */

public class Probleam24 {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        // 创建接收队列和优先队列，插入k个数据，队头元素与 input中比较剔除，返回对应结果
        ArrayList<Integer> list = new ArrayList<>();
        if(input == null || k > input.length || k <= 0){
            return list;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, Comparator.reverseOrder());

        for (int i = 0; i < input.length; i++) {
            if (i < k){
                queue.offer(input[i]);
            }else {
                if (input[i] < queue.peek()){
                    queue.poll();
                    queue.offer(input[i]);
                }
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(queue.poll());
        }
        return list;
    }

    public static void main(String[] args) {
        int [] input = {9,6,7,8,2,11,3,7,4};
        System.out.println(GetLeastNumbers_Solution(input, 4));
    }
}
