package eastMoney.medium;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reach){
                return false;
            }
            reach = Math.max(nums[i] + i,reach);
        }
        return true;
    }

}
