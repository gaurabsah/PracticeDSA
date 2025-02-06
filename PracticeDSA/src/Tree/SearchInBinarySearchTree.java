package Tree;

public class SearchInBinarySearchTree {

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

    public static TreeNode search(TreeNode root, int key){
        if (root == null || root.value == key){
            return root;
        }

        if (key < root.value){
            return search(root.left,key);
        } else {
            return search(root.right,key);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        int searchKey = 5;

        TreeNode search = search(root, searchKey);
        System.out.println(search != null ? "Found" : "Not Found");

    }

}
