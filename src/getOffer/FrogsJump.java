package getOffer;

//一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。

public class FrogsJump {
    //和斐波那契一模一样

    public int numWays(int n) {
        int a = 1, b = 2, sum;
        for (int i = 1; i < n; i++) {
            //防止溢出
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
