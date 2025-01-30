package Tree;

import java.util.List;

/**
 * Root -> Left -> Right
 */

public class PreOrderTraversal {

    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }

    public void preOrder(TreeNode root){
        if (root == null){
            return;
        }

        System.out.println(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.preOrder(root);
    }
}
