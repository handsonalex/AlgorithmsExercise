package eastMoney.simple;

import java.util.Arrays;

public class ReverseInt_07 {
    public static int reverse(int x) {
        int res = 0;
        while (x != 0){
            int tmp = res * 10 + x % 10;
            if(tmp / 10 != res){
                return 0;
            }
            res = tmp;
            x = x / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1999649999));
    }
}
