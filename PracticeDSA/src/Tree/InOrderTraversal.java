package Tree;

/**
 * Root -> Left -> Right
 */

public class InOrderTraversal {

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

    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.value+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        inOrderTraversal.inOrder(root);
    }
}
