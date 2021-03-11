package getOffer.rebuildTree;

import java.util.HashMap;

//输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

public class BuildTree {
    private int[] preorder;
    //储存中序遍历的节点和下标对应关系

    private HashMap<Integer,Integer> dic = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i],i);
        }
        return build(0,0,inorder.length - 1);
    }

    //left 和 right是左右子树的边界坐标,不是起始坐标

    public TreeNode build(int root,int left,int right){
        //因为题目给的是有序二叉树,所以当左大于右就判定为过界
        if (left > right){
            return null;
        }
        TreeNode node = new TreeNode(preorder[root]);
        int i = dic.get(preorder[root]);
        node.left = build(root, left, i-1);
        node.right = build(root + left - i + 1, i + 1, right);
        return node;
    }
}
