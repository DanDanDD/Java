package Array;

/**
 * @author: Dennis
 * @date: 2019/7/26 10:09
 */

public class WaysArray {
    public static void main(String[] args) {
    array(new int[]{1,8,9,5,6,54,654,12,55,88,77,66,22});
    }
    public static void array(int[] temp){
        double[] text = new double[4];
        text[0] = temp[0];
        text[1] = temp[1];
        text[2] = temp[2];
        text[3] = temp[3];
        for (int i=0;i<temp.length;i++){
            text[0] += temp[i];
            if (temp[i]>text[2]){
                text[2] = temp[i];
            }if (temp[i]<text[3]){
            text[3] = temp[i];
            }
        }
        text[1] = text[0]/temp.length;
        System.out.println("sum="+text[0]);
        System.out.println("pj="+text[1]);
        System.out.println("max="+text[2]);
        System.out.println("min="+text[3]);
    }
}

