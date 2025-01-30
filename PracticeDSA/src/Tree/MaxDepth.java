package Tree;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class MaxDepth {

    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
//        create binary tree: [3, 9, 20, null, null, 15, 7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaxDepth maxDepth = new MaxDepth();
        int depth = maxDepth.maxDepth(root);
        System.out.println("Maximum Depth of Binary Tree: "+depth);
    }
}
