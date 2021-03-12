package getOffer;

//写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)

public class Fibonacci {
    public int mySolution(int n) {
        if (n < 1){
            return  0;
        }else if (n == 1){
            return 1;
        }
        int[] dic = new int[n+1];
        int a = 0;
        int b = 1;
        int sum = 0;
        dic[0] = a;
        dic[1] = b;
        for (int i = 2; i < dic.length; i++) {
            //防止数字超出int长度
            sum = (a + b) % 1000000007;
            dic[i] = sum;
            a = b;
            b = sum;
        }
        return sum;
    }

    //最佳解法,可以不用数组,直接对三个变量的值进行交替

    public int fib(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
