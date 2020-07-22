import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Solution{
    public static void search(int[] arr){
        int count = 0;
        int i,j;
        int n = arr.length;
        int target;
        for (i = 1;i<n;i++){
            j =i;
            target = arr[i];
            while (j > 0 && target< arr[j-1]){
                arr[j] = arr[j-1];
                j--;
                count++;
            }
            arr[j] = target;

        }
        System.out.println(count);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {

        // 创建 BufferedReader对象
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 读取第一行数据
        String line = br.readLine();
        // 用空格分隔开字符串
        String[] string = line.split(" ");
        int f = Integer.parseInt(string[0]);
        // 读取第二行数据
        line = br.readLine();
        string = line.split(" ");

        // 创建一个 int 型数组来保存第二行输入的数字
        int[] arr = new int[f];
        // 利用 for 循环将输入的数字存储到刚刚创建的数组中
        for (int i = 0; i < f; i++) {
            arr[i] = Integer.parseInt(string[i]);
            // ↑ Integer.paeseInt() 方法可以将 string 类型转为 int 类型
            //  注：只有当 string 中的元素都为数字时才可以成功 ↑
        }

        Solution.search(arr);




    }
}
