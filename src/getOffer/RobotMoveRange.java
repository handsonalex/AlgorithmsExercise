package getOffer;
/*
地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。
请问该机器人能够到达多少个格子？
 */

public class RobotMoveRange {
    public int movingCount(int m, int n, int k) {
        if (k == 0){
            return 1;
        }
        boolean[][] vis = new boolean[m][n];
        vis[0][0] = true;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int limited = i / 10 + i % 10 + j / 10 + j % 10;
                if (k < limited){
                    continue;
                }
                //判断前一个是有路径
                if (i - 1 >= 0){
                    //boolean数组默认值位false,| 为位运算符,即全为0时才是0
                    vis[i][j] |= vis[i - 1][j];
                }
                //判断上一个是否有路径
                if (j - 1 >= 0){
                    vis[i][j] |= vis[i][j - 1];
                }
                count += vis[i][j] ? 1 : 0;
            }
        }
        return count;
    }
}
