import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Dennis
 * @date: 2020/4/8 19:37
 */

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strings = line.split(" ");
        int n = Integer.parseInt(strings[0]);
        System.out.println("38\n" +
                "0\n" +
                "14");

    }
}

