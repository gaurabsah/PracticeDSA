package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DFS {

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode traversal(TreeNode root){
        if (root == null){
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> traversalList = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()){

        }


        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
    }
}
