class TreeNode {
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
public class IncreasingBST {
    TreeNode dummy = new TreeNode(0);
    public TreeNode increasingBST(TreeNode root) {
        TreeNode result = dummy;
        help(root);
        return result.right;
    }
    public void help(TreeNode root){
        if (root==null)
            return;
        help(root.left);
        dummy.right = new TreeNode(root.val);
        dummy.left = null;
        dummy = dummy.right;
        help(root.right);
    }
    public static void main(String[] args) {
        TreeNode subLeftLeft = new TreeNode(2);
        TreeNode subRightLeft = new TreeNode(4);
        TreeNode left = new TreeNode(3, subLeftLeft, subRightLeft);
        TreeNode subRightRight = new TreeNode(8);
        TreeNode right = new TreeNode(6, null, subRightRight);
        TreeNode root = new TreeNode(5, left, right);
        TreeNode res = new IncreasingBST().increasingBST(root);
        System.out.println(res.right.val);
    }
}
