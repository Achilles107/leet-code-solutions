import javax.swing.tree.TreeNode;
import java.util.Stack;

class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;
    TreeNodes(){}
    TreeNodes(int val){
        this.val = val;
    }
    TreeNodes(int val, TreeNodes left, TreeNodes right){
        this.val = val;
        this.left= left;
        this.right = right;
    }
}
public class MaxDepth {
    //Stack<TreeNodes> stack = new Stack<>();
    static StringBuilder str = new StringBuilder();
    public boolean isSymmetric(TreeNodes root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        preorder(root);
        String original = str.toString();
        return original.equals(str.reverse().toString());
    }
    public void preorder(TreeNodes root){
        if (root == null)
            return;
        preorder(root.left);
        str.append(root.val);
        //System.out.println(root.val);
        preorder(root.right);
    }
    public boolean isBST(TreeNodes root, TreeNodes l, TreeNodes r){
        if (root == null)
            return true;
        if (l !=null && root.val <= l.val)
            return false;
        if (r != null && root.val >= r.val)
            return false;
        return isBST(root.left, l, root) && isBST(root.right, root, r);
    }
    public boolean isValidBST(TreeNodes root) {
        return isBST(root, null, null);

    }
    public int maxDepth(TreeNodes root) {
        if (root == null)
            return 0;
        int leftChild = maxDepth(root.left);
        int rightChild = maxDepth(root.right);
        if (leftChild < rightChild){
            return rightChild+1;
        } else {
            return leftChild+1;
        }
    }
    public static void main(String[] args) {
        TreeNodes root = new TreeNodes(1);
        TreeNodes l1 = new TreeNodes(2);
        TreeNodes r1 = new TreeNodes(2);
        /*TreeNodes ll1 = new TreeNodes(3);
        TreeNodes lr1 = new TreeNodes(4);
        TreeNodes rl1 = new TreeNodes(4);
        TreeNodes rr1 = new TreeNodes(3);*/
        /*r1.left = rl1;
        r1.right = rr1;
        l1.left = ll1;
        l1.right = lr1;*/
        root.left = l1;
        root.right = r1;
        System.out.println(new MaxDepth().isSymmetric(root));

    }
}
