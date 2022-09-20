package Trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode right1 = new TreeNode(15);
        TreeNode right2 = new TreeNode(7);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20, right1, right2);
        TreeNode root = new TreeNode(3, left, right);
        System.out.println(maxDepth(root));
    }

    /**
     * Use recursively Time: O(n) Space: O(1)
     * 
     * @param root TreeNode
     * @return maximum depth
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}