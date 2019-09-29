package Array;

public class arrayPractice {
    public static int arrayMax(int[] data){
        int max = data[0];
        for (int i = 0;i <data.length;i++){
            if (data[i] > max){
                max = data[i];
            }
        }
    return max;
    }

    public static int arrayMin(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public static int arraySum(int[] data){
        int sum = 0;
        for (int i = 0;i < data.length;i++){
            sum += data[i];
        }
        return sum;
    }
    public static int[] arrayJoin(int[]a, int[]b){
        int[] join = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++){
            join[i] = a[i];
        }
        for (int i = 0; i<b.length;i++){
            join[a.length + i] = b[i];
        }
        return join;
    }
    public static int[] arraySub(int[] data, int start, int end){
        int[] sub = new int[end-start];
        int flag = 0;
         for (int i = start; i < end; i++){
            sub[flag] = data[i];
            flag++;
        }
        return sub;
    }

    public static int printArray(int[] data){
        for (int i : data){
            System.out.print(i+"、");
        }
        System.out.println();
        return 0;
    }

    public static void main(String[] args) {
        int[]data = new int[]{1,3,6,4,8,9,7,5};
        System.out.println(arrayMax(data));
        System.out.println(arrayMin(data));
        System.out.println(arraySum(data));
        int[] A = new int[]{1,3,5,7,9};
        int[] B = new int[]{2,4,6,8,10};
        int[] join = arrayJoin(A,B);
        printArray(join);
        int[] sub = arraySub(B,1,4);
        printArray(sub);
    }
}
