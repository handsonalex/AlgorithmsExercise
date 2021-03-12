package getOffer;

/*用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ,
分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )*/

import java.util.Stack;

public class CQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public CQueue() {
        this.stackIn = new Stack<>();
        this.stackOut = new Stack<>();
    }

    public void appendTail(int value) {
        stackIn.add(value);
    }

    public int deleteHead() {
        if (stackOut.empty()) {
            while (!stackIn.empty()) {
                stackOut.add(stackIn.pop());
            }
            if (stackOut.empty()){
                return -1;
            }
        }
        return stackOut.pop();
    }

    /*
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(5);
        cQueue.appendTail(2);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
