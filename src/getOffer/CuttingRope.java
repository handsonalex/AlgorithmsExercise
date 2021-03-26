package getOffer;

/*
给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。
请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，
此时得到的最大乘积是18。
 */

public class CuttingRope {
    public int cuttingRope(int n) {
        //用求极值推出的,每段是3时,乘积最大
        if (n <= 3){
            return n - 1;
        }
        //能分成a段长度为3的
        int a = n / 3;
        //多余出的部分
        int b = n % 3;
        if (b == 1){
            //多余了1时,把前一个3拆出来,加成4,因为1*3明显没有2*2大,所以这里用a-1次方
            return (int)Math.pow(3,a - 1) * 4;
        }
        //多余了2或者0时,直接乘就行
        else if (b == 2){

            return (int)Math.pow(3,a) * 2;
        }
        return (int)Math.pow(3,a);
    }
}
