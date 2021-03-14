package getOffer;
/*把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，
输出旋转数组的最小元素。例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。*/

public class SpinArray {
    public static int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right)/2;
        while (left < right){
            if (numbers[right] < numbers[mid]){
                //右更大表示最小值在右端,所以left变到mid + 1
                left = mid + 1;
            } else if (numbers[right] == numbers[mid]){
                //相等时不确定在左右哪端,但是最右侧可以确定是有序的,所以从右边减一位再比较
                right--;
            } else{
                //右小表示最小值在左端
                right = mid;
            }
            mid = (left + right)/2;
        }
        return numbers[mid];
    }
}
