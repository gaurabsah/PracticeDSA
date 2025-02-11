package Tree;

public class ValidateBST {

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

    static boolean isValidate(TreeNode root){
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        boolean isValid = isValidate(root);

        System.out.println(isValid ? "BST" : "Not BST");
    }

}
