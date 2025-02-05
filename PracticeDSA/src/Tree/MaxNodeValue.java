package Tree;

public class MaxNodeValue {

    private static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public int findMaxNode(TreeNode root){
        if (root == null){
            return Integer.MIN_VALUE;
        }

        int result = root.value;
        int left = findMaxNode(root.left);
        int right = findMaxNode(root.right);

        if (left > result){
            result = left;
        }

        if (right > result){
            result = right;
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaxNodeValue nodeValue = new MaxNodeValue();
        int maxNode = nodeValue.findMaxNode(root);
        System.out.println("Node containing max value: "+maxNode);
    }
}
