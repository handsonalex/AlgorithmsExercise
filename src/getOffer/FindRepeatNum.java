package getOffer;

import java.util.HashSet;
import java.util.Set;

/*找出数组中重复的数字。
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
请找出数组中任意一个重复的数字。*/

public class FindRepeatNum {

//  做的时候想多了,只要求随便找到一个重复的数即可,自己的解法是按找到所有重复数来写的

    public int mySolution(int[] nums) {
        //创建一个数组,数组内容存的就是这个数字出现了几次
        int[] count  = new int[nums.length];
        int result = 0;
        for (int num : nums) {
            count[num]++;
        }
        //找到数组中出现1次以上的数
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1){
                result = i;
            }
        }
        return result;
    }

/*    最优解
    时间复杂度：O(n)O(n)。
    遍历数组一遍。使用哈希集合（HashSet），添加元素的时间复杂度为 O(1)，故总的时间复杂度是 O(n)。
    空间复杂度：O(n)。不重复的每个元素都可能存入集合，因此占用 O(n) 额外空间。*/

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}
