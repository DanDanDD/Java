package backtrack;

/**
 * @author: Dennis
 * @date: 2020/8/5 17:51
 */

public class LeetCode130 {
    int [][] nextPosition = {{0,1},{1,0},{0,-1},{-1,0}};
    public void DFS(char[][] board, int row, int column, int i, int j){
        board[i][j] = '*';
        for (int k =0; k < 4; k++){
            int ni = i + nextPosition[k][0];  // 列上+-
            int nj = j + nextPosition[k][1];  // 行上+-

            if (ni < 0 || ni >= row || nj < 0 || nj >= column){
                continue;
            }
            // O 附近的 不为*和X都进行DFS
            if (board[ni][nj] != '*' && board[ni][nj] != 'X'){
                DFS(board,row,column,ni,nj);
            }
        }
    }



    public void solve(char[][] board) {
        if (board.length == 0){
            return;
        }
        int row = board.length;
        int column = board[0].length;

        for (int i = 0; i < row; i++){
            if (board[i][0] == 'O'){  // 第一列
                DFS(board,row,column,i,0);
            }
            if (board[i][column - 1] == 'O') {  // 最后一列
                DFS(board,row,column,i,column-1);
            }
        }

        for (int j = 0; j < column; j++){
            if (board[0][j] == 'O') {  // 第一行
                DFS(board,row,column,0,j);
            }
            if (board[row -1 ][j] == 'O'){  // 第一列
                DFS(board,row,column,row-1,j);
            }
        }

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if (board[i][j] == '*') { // 经过DFS标记的全部还原为 O
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') { // 被 X 包围的 O 替换为 X
                    board[i][j] = 'X';
                }
            }
        }

    }
}
