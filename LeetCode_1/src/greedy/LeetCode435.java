package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: Dennis
 * @date: 2020/8/4 10:40
 */

//class myComparator implements Comparator<int[]>{
//    @Override
//    public int compare(int[] a1, int[] a2) {
//        // 按照 结束时间 递增排序
//        return a1[1] - a2[1];
//    }
//}
//public class LeetCode435 {
//    public int eraseOverlapIntervals(int[][] intervals) {
//        if (intervals.length == 0){
//            return 0;
//        }
//        // 按照结束进行递增排序
//        Arrays.sort(intervals, new myComparator());
//        int num = 1;
//        int i = 0;
//        for (int j = 1; j < intervals.length; j++) {
//            if (intervals[j][0] >= intervals[i][1]){
//                // 后一个的开始时间大于前一个的结束时间
//                num++;
//                i = j;
//            }
//        }
//        return intervals.length - num;
//    }
//}


class myComparator implements Comparator<int[]>{
    @Override
    public int compare(int[] a1, int[] a2) {
        // 按照 开始时间 递增排序
        return a1[0] - a2[0];
    }
}
public class LeetCode435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0){
            return 0;
        }
        // 按照结束进行递增排序
        Arrays.sort(intervals, new myComparator());
        int num = 0;
        int i = 0;
        for (int j = 1; j < intervals.length; j++) {
            if (intervals[j][0] >= intervals[i][1]){
                i = j;
            }else{
                if (intervals[j][1] < intervals[i][1]){
                    i = j;
                }
                num++;
            }
        }
        return num;
    }
}
