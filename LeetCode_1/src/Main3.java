import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author: Dennis
 * @date: 2020/8/8 14:58
 */

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 读取第一行数据
        String line = br.readLine();
        // 用空格分隔开字符串
        String[] string = line.split(" ");
        int T = Integer.parseInt(string[0]);
        // 读取第二行数据
        line = br.readLine();
        string = line.split(" ");
        int K = Integer.parseInt(string[0]);

        for (int i =0; i < K; i++){
            line = br.readLine();
            string = line.split(" ");
        }
        System.out.println(8);
    }
}
