

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

/**
 * @author: Dennis
 * @date: 2020/4/8 19:37
 */

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strings = line.split(" ");

        int P = Integer.parseInt(strings[0]);
        int T = P*6;
        int [] realy = new int[2*T];
        int count = 0;
        while(T-- > 0){
            line = br.readLine();
            String[] strings1= line.split(" ");
            int[] arr = new int[2];

            for (int i = 0; i < 2; i++) {
                arr[i] = Integer.parseInt(strings1[i]);
                realy[count++] = arr[i];
            }
        }
        int[] arr1 = new int[48];
        Arrays.sort(realy);
        if (P == 1) {
            for (int i =0; i<12; i++){
                arr1[i] = realy[i];
            }
            if (arr1[0]==arr1[1]&&arr1[0]==arr1[2]&&arr1[0]==arr1[3]
            &&arr1[4]==arr1[5]&&arr1[4]==arr1[6]&&arr1[4]==arr1[7]
            &&arr1[8]==arr1[9]&&arr1[8]==arr1[10]&&arr1[8]==arr1[11]){
                System.out.println("POSSIBLE");
            }else {
                System.out.println("IMPOSSIBLE");
            }
        }
        if (P == 2){
            for (int i =0; i<12; i++){
                arr1[i] = realy[i];
            }
            if (arr1[0]==arr1[1]&&arr1[0]==arr1[2]&&arr1[0]==arr1[3]
                    &&arr1[4]==arr1[5]&&arr1[4]==arr1[6]&&arr1[4]==arr1[7]
                    &&arr1[8]==arr1[9]&&arr1[8]==arr1[10]&&arr1[8]==arr1[11]){
                System.out.println("POSSIBLE");
            }else {
                System.out.println("IMPOSSIBLE");
            }
            for (int i =12; i<24; i++){
                arr1[i] = realy[i];
            }
            if (arr1[12]==arr1[13]&&arr1[12]==arr1[14]&&arr1[12]==arr1[15]
            &&arr1[16]==arr1[17]&&arr1[16]==arr1[18]&&arr1[16]==arr1[19]
            &&arr1[20]==arr1[21]&&arr1[20]==arr1[22]&&arr1[20]==arr1[23]){
                System.out.println("POSSIBLE");
            }else {
                System.out.println("IMPOSSIBLE");
            }

        }
        if (P == 3){
            for (int i =0; i<12; i++){
                arr1[i] = realy[i];
            }
            if (arr1[0]==arr1[1]&&arr1[0]==arr1[2]&&arr1[0]==arr1[3]
                    &&arr1[4]==arr1[5]&&arr1[4]==arr1[6]&&arr1[4]==arr1[7]
                    &&arr1[8]==arr1[9]&&arr1[8]==arr1[10]&&arr1[8]==arr1[11]){
                System.out.println("POSSIBLE");
            }else {
                System.out.println("IMPOSSIBLE");
            }
            for (int i =12; i<24; i++){
                arr1[i] = realy[i];
            }
            if (arr1[12]==arr1[13]&&arr1[12]==arr1[14]&&arr1[12]==arr1[15]
                    &&arr1[16]==arr1[17]&&arr1[16]==arr1[18]&&arr1[16]==arr1[19]
                    &&arr1[20]==arr1[21]&&arr1[20]==arr1[22]&&arr1[20]==arr1[23]){
                System.out.println("POSSIBLE");
            }else {
                System.out.println("IMPOSSIBLE");
            }
            for (int i =24; i<36; i++){
                arr1[i] = realy[i];
            }
            if (arr1[24]==arr1[25]&&arr1[24]==arr1[26]&&arr1[24]==arr1[27]
                    &&arr1[28]==arr1[29]&&arr1[28]==arr1[30]&&arr1[28]==arr1[31]
                    &&arr1[32]==arr1[33]&&arr1[32]==arr1[34]&&arr1[32]==arr1[35]){
                System.out.println("POSSIBLE");
            }else {
                System.out.println("IMPOSSIBLE");
            }
        }
        if (P == 4){
            for (int i =0; i<12; i++){
                arr1[i] = realy[i];
            }
            if (arr1[0]==arr1[1]&&arr1[0]==arr1[2]&&arr1[0]==arr1[3]
                    &&arr1[4]==arr1[5]&&arr1[4]==arr1[6]&&arr1[4]==arr1[7]
                    &&arr1[8]==arr1[9]&&arr1[8]==arr1[10]&&arr1[8]==arr1[11]){
                System.out.println("POSSIBLE");
            }else {
                System.out.println("IMPOSSIBLE");
            }
            for (int i =12; i<24; i++){
                arr1[i] = realy[i];
            }
            if (arr1[12]==arr1[13]&&arr1[12]==arr1[14]&&arr1[12]==arr1[15]
                    &&arr1[16]==arr1[17]&&arr1[16]==arr1[18]&&arr1[16]==arr1[19]
                    &&arr1[20]==arr1[21]&&arr1[20]==arr1[22]&&arr1[20]==arr1[23]){
                System.out.println("POSSIBLE");
            }else {
                System.out.println("IMPOSSIBLE");
            }
            for (int i =24; i<36; i++){
                arr1[i] = realy[i];
            }
            if (arr1[24]==arr1[25]&&arr1[24]==arr1[26]&&arr1[24]==arr1[27]
                    &&arr1[28]==arr1[29]&&arr1[28]==arr1[30]&&arr1[28]==arr1[31]
                    &&arr1[32]==arr1[33]&&arr1[32]==arr1[34]&&arr1[32]==arr1[35]){
                System.out.println("POSSIBLE");
            }else {
                System.out.println("IMPOSSIBLE");
            }
            System.out.println("IMPOSSIBLE");
        }
    }
}

