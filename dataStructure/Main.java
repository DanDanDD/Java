import com.sun.javaws.IconUtil;

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
        int m = Integer.parseInt(strings[1]);

        line = br.readLine();
        String[] strings1= line.split(" ");
        int[] arr = new int[100];
        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        int count = 0;
        int end = 0;
        if (m == 1){
            System.out.println(1);
        }else{
            for (int i = 0; i < n; i++){
                for (int j = end+1; j < n; j++){

                if (arr[i] > arr[j]) {
                        arr[n++] = arr[j];
                        count++;
                        end++;
                } else {
                    arr[n++] = arr[i];
                    end++;
                    break;
                }
            }
            if (count == m-1){
                break;
            }
        }
        System.out.println(end-1);

    }
    }
}

