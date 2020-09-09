import java.util.*;

public class Main {
//    public int eraseOverlapIntervals (int[][] intervals) {
//        // write code here
//        if (intervals.length == 0){
//            return 0;
//        }
//
//        Arrays.sort(intervals, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return (o1[1] - o2[2]);
//            }
//        });
//
//        int num  = 1;
//        int i = 0;
//        for (int j = 1; j < intervals.length; j++) {
//            if (intervals[j][0] >= intervals[i][1]){
//                num++;
//                i = j;
//            }
//        }
//        return intervals.length - num;
//    }

    public static int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
    public static int M,N;

    public static int dfs(int[][] arr, int i, int j, int[][]cache){
        if (cache[i][j] != 0){
            return cache[i][j];
        }
        for (int[] d : dirs){
            int x = i + d[0];
            int y = j + d[1];
            if (x >= 0 && x < M && y >= 0 && y < N && arr[x][y] > arr[i][j]){
                cache[i][j] = Math.max(cache[i][j], dfs(arr,x,y,cache));
            }
        }
        return cache[i][j]++;
    }

    public static void pp(int[][] arr){
        int[][] cache = new int[M][N];
        int ans = 0;
        for (int i =0; i < M; i++){
            for (int j = 0; j < N; j++) {
                ans = Math.max(ans,dfs(arr,i,j,cache));
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         M = scanner.nextInt();
         N = scanner.nextInt();
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        pp(arr);

    }
}
//    public static int Search(char[] c){
//        if (c == null || c.length == 0){
//            return 0;
//        }
//        int g = 0;
//        int o = 0;
//        int d = 0;
//        for (char s : c) {
//            if (s == 'G') {
//                g++;
//            } else if (s == 'o') {
//                o++;
//            } else if (s == 'd') {
//                d++;
//            }
//        }
//        o = o/2;
//        int temp = Math.min(g,o);
//        int result = Math.min(temp,d);
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        char[] c = scanner.nextLine().toCharArray();
//        System.out.println(Search(c));
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

