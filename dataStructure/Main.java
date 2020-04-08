import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Dennis
 * @date: 2020/4/8 19:37
 */

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine();
//        String[] strings = line.split(" ");
//        int n = Integer.parseInt(strings[0]);
//        int m = Integer.parseInt(strings[1]);
//        int a = Integer.parseInt(strings[2]);
//        int b = Integer.parseInt(strings[3]);
//
//        if (n==m || m%n==0){
//            System.out.println(0);
//        }
//
//        if (n > m){
//            if (a < b || a==b){
//            System.out.println(a*(n-m));
//            }else {
//                System.out.println(b*(n-m));
//            }
//        }
//
//        if (n < m){
//            if (a>b || a==b){
//                System.out.println((n*(m-n)-m)*b);
//            }else{
//                System.out.println();
//            }
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);

        while(t-- > 0) {
            line = br.readLine();
            String[] strings = line.split("");
            int l = strings.length;

            if (l == 1) {
                System.out.println("Cassidy");
            }
            if (l == 2 && strings[0].equals(strings[1])) {
                System.out.println("Cassidy");
            }


        }
    }
}

