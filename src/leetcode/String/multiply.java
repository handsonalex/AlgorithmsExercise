package leetcode.String;

import java.util.Arrays;

public class multiply {
    public static String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2)){
            return "0";
        }
        int n = num1.length();
        int m = num2.length();
        int[] nums = new int[n + m];
        for (int i = n - 1; i > -1; i--) {
            for (int j = m - 1; j > -1; j--) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                nums[i + j + 1] += a * b;
            }
        }
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i - 1] += nums[i] / 10;
            nums[i] %= 10;
        }
        StringBuilder res = new StringBuilder();
        int index = nums[0] == 0 ? 1 : 0;
        for (int i = index; i < nums.length; i++) {
            res.append(nums[i]);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String num1 = "2113";
        String num2 = "98";
        System.out.println(multiply(num1,num2));
    }
}

