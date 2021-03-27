package getOffer;
//剪绳子的高次版本

public class CuttingRope2 {
    public static int cuttingRope(int n) {
        if(n <= 3){
            return n - 1;
        }
        int b = n % 3, p = 1000000007;
        long rem = 1, x = 3;
        //快速幂
        for(int a = n / 3 - 1; a > 0; a /= 2) {
            //如果a是偶数时,最后变为1时等于是把x的值赋回rem,如果a是奇数时,等于在最开始已经给rem赋了个3,在最后把这个3乘到之前的结果
            if(a % 2 == 1) {
                rem = (rem * x) % p;
            }
            x = (x * x) % p;
        }
        if(b == 0){
            return (int)(rem * 3 % p);
        }
        if(b == 1){
            return (int)(rem * 4 % p);
        }
        return (int)(rem * 6 % p);
    }

}
