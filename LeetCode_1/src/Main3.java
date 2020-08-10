import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author: Dennis
 * @date: 2020/8/8 14:58
 */

public class Main3 {
    public static void SearchingResult(Long[] arr, long result){
        for (int i =0; i < arr.length; i++){
            if (arr[i] == 1){
                continue;
            }
            if (arr[i] == 2 || arr[i] == 3){
                result++;
                continue;
            }
            if (arr[i] > 3){
                long temp = arr[i] / 2;
                result += temp;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        // 创建 BufferedReader对象
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 读取第一行数据
        String line = br.readLine();
        String[] string = line.split(" ");
        int n = Integer.parseInt(string[0]);
        // 读取第二行数据
        line = br.readLine();
        string = line.split(" ");
        String[] string2 = line.split(" ");

        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++){
            arr[i] = Long.parseLong(string2[i]);
        }
        long result = 0;
        SearchingResult(arr,result);
    }

}
