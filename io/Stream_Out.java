package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author: Dennis
 * @date: 2020/4/2 17:08
 */

public class Stream_Out {
    public static void main(String[] args) throws IOException {
        File file = new File("测试目录\\测试文件.txt");
        file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);
        byte[] buffer = "我是中国人".getBytes("UTF-8");
        outputStream.write(buffer);
    }
}
