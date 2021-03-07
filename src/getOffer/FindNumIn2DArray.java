package getOffer;
/*在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，
输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。*/

public class FindNumIn2DArray {
    public boolean mySolution(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        for (int[] nums : matrix) {
            //测试用例给的数组第一列都是逐渐增大的,如果target比第一个数小就不用比了
            if(nums[0] > target){
                return false;
            }
            //因为数组由增序排列,可以直接排除比最后一位大的行
            if (nums[nums.length - 1] >= target) {
                for (int num : nums) {
                    if (target == num) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
