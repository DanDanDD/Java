package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.DoubleToIntFunction;

/**
 * @author: Dennis
 * @date: 2020/4/2 17:57
 */

public class Stream_Input {
    public static void main(String[] args) throws IOException {
        File file = new File("测试目录\\测试文件.txt");

        InputStream inputStream = new FileInputStream(file);
//        System.out.println(inputStream.available());  // 估算值
//        int b;
//        // 正确方式
//        while((b = inputStream.read()) != -1){
//            System.out.println(b);
        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);
        System.out.println(len);
        String s = new String(buf,"UTF-8");
        System.out.println(s);
    }
}
