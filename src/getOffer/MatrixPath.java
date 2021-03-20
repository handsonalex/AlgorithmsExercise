package getOffer;
/*
请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，
每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
[["a","b","c","e"],
["s","f","c","s"],
["a","d","e","e"]]
但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
**/

public class MatrixPath {
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board,chars,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board,char[] chars, int i,int j,int k){
        //判断这里要注意顺序,要先判断不出界才可以
        if (i >= board.length || i < 0 || j < 0 || j >= board[0].length || board[i][j] != chars[k]){
            return false;
        }
        //char数组找完等于路径完成,直接返回true
        if (k == chars.length - 1){
            return true;
        }
        //查过的路径置为空
        board[i][j] = '\0';
        //上下左右路径查找
        boolean res = dfs(board,chars,i + 1, j , k + 1) || dfs(board,chars,i , j + 1, k + 1)||
                dfs(board,chars,i - 1, j , k + 1) || dfs(board,chars,i, j - 1, k + 1);
        //把置空的值要还原回矩阵
        board[i][j] = chars[k];
        return res;
    }
}
