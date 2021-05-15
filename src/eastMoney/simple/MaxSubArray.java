package eastMoney.simple;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 1,pre = 0; i < nums.length; i++,pre++) {
            if (nums[pre] < 0){
                max = Math.max(max,nums[i]);
                continue;
            }
            nums[i] = nums[i] + nums[pre];
            max = Math.max(max,nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {-2,1};
        System.out.println(maxSubArray(a));
    }
}
