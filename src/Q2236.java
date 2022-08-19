//判断根节点是否等于子节点之和
//...毫无难度
class Q2236 {
    public boolean checkTree(TreeNode root) {
        return (root.val == root.left.val + root.right.val);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


