package eastMoney.simple;

import java.util.Stack;

public class AddString {
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        StringBuilder res = new StringBuilder();
        while (i > -1 || j > -1 || add != 0){
            int a = i > -1 ? num1.charAt(i) - '0' : 0;
            int b = j > -1 ? num2.charAt(j) - '0' : 0;
            res.append((a + b + add)%10);
            add = (a + b + add) / 10;
            i--;
            j--;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String b = addStrings("99","99");
        System.out.println(b);
    }
}
