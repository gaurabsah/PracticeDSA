package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

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

    public List<List<Integer>> traversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> traversalList = new LinkedList<>();

        if (root == null){
            return traversalList;
        }

        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode temp = queue.poll();
                subList.add(temp.value);

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }

            traversalList.add(subList);
        }

        return traversalList;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BFS bfs = new BFS();
        List<List<Integer>> list = bfs.traversal(root);
        for (List<Integer> integers : list) {
            System.out.println(integers);
        }


    }
}
