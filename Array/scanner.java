package Day1;

import java.util.Scanner;

/**
 * @author: Dennis
 * @date: 2019/10/9 11:21
 */

public class scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        if (age<=0) {
            return;
        } if (age>0&&age<=3){
            System.out.println("baby");
        } if (age>3&&age<=16){
            System.out.println("teenager");
        }else {
            System.out.println("adult");
        }
    }
}
