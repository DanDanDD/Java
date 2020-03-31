package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author: Dennis
 * @date: 2020/3/31 17:42
 */

public class ListDir {
    public static void listDir(File dir){
        File[] files = dir.listFiles();
        for (File file : files){
            if (file.isDirectory()){
                listDir(file);
            }else {
                System.out.println(file.getAbsolutePath() + ":" + file.length());
            }

        }
    }

    public static void main(String[] args) throws IOException {
        listDir(new File("E:\\360驱动大师目录"));
//        File file1 = new File("E:\\360驱动大师目录\\111.txt");
//        file1.createNewFile();
    }
}
