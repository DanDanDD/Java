package test;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Dennis
 * @date: 2020/7/22 15:46
 */

public class buffered {
    public static void main(String[] args) throws IOException {
//        // 创建 BufferedReader对象
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        // 读取第一行数据
//        String line = br.readLine();
//
//        System.out.println(line);

        // 创建 BufferedReader对象
        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
        // 读取第一行数据
        String line = br.readLine();
        // 用空格分隔开字符串
        String[] string = line.split(" ");

        int f = Integer.parseInt(string[0]);
        int s = Integer.parseInt(string[1]);
        System.out.println("f:" + f + "  s:" + s);

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
        // 利用 foreach 将数组输出
        for (int out : arr) {
            System.out.print(out + "");
        }


    }
}
