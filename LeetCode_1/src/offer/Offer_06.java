package offer;

/**
 * @author: Dennis
 * @date: 2020/10/14 23:47
 */
//旋转数组的最小数字

public class Offer_06 {
    public int minNumberInRotateArray(int [] array) {
        int start=0;
        int end=array.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(end-start==1) {
                return array[end];
            }
            if(array[mid]>=array[start]) {
                start=mid;
            }
            if(array[mid]<=array[end]) {
                end=mid;
            }
        }
        return -1;

    }
}
