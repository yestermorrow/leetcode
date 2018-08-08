package primary.array;

/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可
 * 校验每一行的数是否重复
 * 校验每一列的数是否重复
 * 校验每一个3 * 3的矩阵是否重复
 *
 */
public class IsValidSudoku {


    public boolean isValidSudoku(char[][] board) {
        int len = board.length;
        boolean row[][] = new boolean[len][len];
        boolean col[][] = new boolean[len][len];
        boolean block[][] = new boolean[len][len];

        for (int i=0; i<len; i++){
            for (int j=0; j<len; j++){
                int c = board[i][j] - '1';
                if (c>=0 && c<=8){
                    if(row[i][c] || col[c][j] || block[3*(i/3)+j/3][c])
                        return false;
                    row[i][c] = true;
                    col[c][j] = true;
                    block[3*(i/3)+j/3][c] = true;
                }
            }
        }
        return true;
    }

}
