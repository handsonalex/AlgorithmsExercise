package getOffer.ReversePrintList;
//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

public class ReversePrintList {

    //可以考虑用栈,就不用计算数组长度,空间复杂度能好很多

    public int[] mySolution(ListNode head) {
        int length = listLength(head);
        if (length == 0){
            return new int[0];
        }
        int[] nums = new int[length];
        int count = 0;
        while (head != null){
            nums[count++] = head.val;
            head = head.next;
        }
        int[] reverse = new int[length];
        for (int i = nums.length - 1; i > -1; i--) {
            reverse[nums.length - i - 1] = nums[i];
        }
        return reverse;
    }

    public static int listLength(ListNode head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}
