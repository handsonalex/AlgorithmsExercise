package eastMoney.medium;

import java.util.*;

public class ShowMeBug {

    public static int[] randomArray(int length){
        Random r = new Random();
        int[] nums = new int[length];
        for(int i = 0; i < length; i++){
            nums[i] = r.nextInt(100);
        }
        Arrays.sort(nums);
        return nums;
    }

    public static ArrayList<ArrayList<Integer>> solution(){
        int[] nums = randomArray(18);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            res.add(list);
        }
        for(int i = 0;i < nums.length; i++){
            int index = nums[i] / 10;
            res.get(index).add(nums[i]);
        }
        res.removeIf(i -> i.size()==0);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }
}
