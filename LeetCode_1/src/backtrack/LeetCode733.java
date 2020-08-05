package backtrack;

/**
 * @author: Dennis
 * @date: 2020/8/5 16:41
 */

public class LeetCode733 {
    public void DFS(int[][] image, int row, int column, int newColor,int color){
        if (image[row][column] == color){
            image[row][column] = newColor;
            // 四种情况，选定格子不在边界时，上下左右寻找color
            if (row >= 1){
                DFS(image,row-1,column,newColor,color);
            }
            if (column >= 1){
                DFS(image,row,column-1,newColor,color);
            }
            if (row+1 < image.length){
                DFS(image,row+1,column,newColor,color);
            }
            if (column+1 < image[0].length){
                DFS(image,row,column+1,newColor,color);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color == newColor){
            return image;
        }else {
            DFS(image,sr,sc,newColor,color);
            return image;
        }
    }
}
