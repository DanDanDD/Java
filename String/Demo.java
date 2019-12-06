package String;
import java.util.Scanner;
/**
 * @author: Dennis
 * @date: 2019/11/27 18:46
 */
/*
字符串拼接
例：   abc def
输出   abcdef
 */

public class Demo {
    public static String func(String str){
        String[] strs = str.split(" ");
        String ret = "";
        for(String s : strs){
            ret = s ;
        }
        return ret;
    }


    public static void main2(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ret = func(str);
        System.out.println(ret);
    }

        public static void main(String[] args){
            Scanner sca = new Scanner(System.in);
            String string = sca.nextLine();
            System.out.println(string.replace(" ",""));
        }
    }
//    public static void main(String[] args) {
////        String string = "abcd";
////        String string2 = new String("abcd");
////        System.out.println(string);
////        System.out.println(string2);  //常理上
////        char[] array = {'a','b'};
////        String string3 = new String(array);
////        System.out.println(array);
////        System.out.println(string==string2);
////        System.out.println(string.equals(string2));
////        String str = "helloworld";
////        char[]data = str.toCharArray();
////        System.out.println(new String(data));
//
//
//    }
