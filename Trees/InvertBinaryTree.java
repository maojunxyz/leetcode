package Trees;

class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode left1 = new TreeNode(1);
        TreeNode left2 = new TreeNode(3);
        TreeNode right1 = new TreeNode(6);
        TreeNode right2 = new TreeNode(9);
        TreeNode left = new TreeNode(2, left1, left2);
        TreeNode right = new TreeNode(7, right1, right2);
        TreeNode root = new TreeNode(4, left, right);
        System.out.println("Before:");
        printTree(root);
        System.out.println("After:");
        root = invertTree(root);
        printTree(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void printTree(TreeNode root) {
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
        TreeNode temp = null;
        int i = 50;
        while (root != null) {
            if (i % 2 == 0) {
                temp = root.right;
                root = root.left;
                if (root.left == null) {
                    break;
                }
                System.out.println(root.left.val);
                System.out.println(root.right.val);
                i--;
            } else {
                root = temp;
                System.out.println(temp.left.val);
                System.out.println(temp.right.val);
                i--;
            }
        }

    }
}

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