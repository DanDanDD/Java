import java.util.Arrays;

public class Main {
    public int[] findAllCheapestPrice (int n, int[][] flights, int src) {
        // write code here

        int[][] dp = new int[n][];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }

    }





//    public String compress (String str) {
//        // write code here
//        if (str == null || str.length() == 0){
//            return "";
//        }
//        int l1 = str.length();
//        char[] c = str.toCharArray();
//        StringBuffer sb = new StringBuffer();
//        char prev = c[0];
//        int count = 1;
//        for (int i = 1; i < l1; i++) {
//            char temp = c[i];
//            if (c[i] == prev){
//                count++;
//            }else {
//                sb.append(prev + "" +count);
//                count = 1;
//                prev = c[i];
//            }
//        }
//        sb.append(prev + "" + count);
//        if (sb.toString().length() > str.length()){
//            return str;
//        }
//        return sb.toString();
//    }




























//    public static void main(String[] args) throws IOException {
//
//        // 创建 BufferedReader对象
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        // 读取第一行数据
//        String line = br.readLine();
//        // 用空格分隔开字符串
//        String[] string = line.split(" ");
//        int f = Integer.parseInt(string[0]);
//        // 读取第二行数据
//        line = br.readLine();
//        string = line.split(" ");
//
//        // 创建一个 int 型数组来保存第二行输入的数字
//        int[] arr = new int[f];
//        // 利用 for 循环将输入的数字存储到刚刚创建的数组中
//        for (int i = 0; i < f; i++) {
//            arr[i] = Integer.parseInt(string[i]);
//            // ↑ Integer.paeseInt() 方法可以将 string 类型转为 int 类型
//            //  注：只有当 string 中的元素都为数字时才可以成功 ↑
//        }
//
//        Solution.search(arr);
//
//    }
}
