package array;

import java.util.Arrays;

/**
 * @author: Dennis
 * @date: 2020/8/12 8:35
 */

// 数组中出现次数超过一半的数
public class problem23 {
    public int MoreThanHalfNum_Solution1(int [] array) {
        if (array == null){
            return 0;
        }
        int target = array[array.length/2];
        int count = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]){
                count++;
            }
            if (count > array.length/2){
                return target;
            }
        }
        return 0;
    }
}
