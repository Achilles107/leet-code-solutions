class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data = data;
    }
}
public class TreeClass {
    int data ;
    int preOrder(Node root, int low, int high){
        if (root == null)
            return 0;
        if (root.data>=low && root.data<=high) {
            data += root.data;
        }
            preOrder(root.left, low, high);
            preOrder(root.right, low, high);
            return data;


    }
    public static void main(String[] args) {
        Node root = new Node(10);
        Node leftNode = new Node(5);
        Node leftLeftNode = new Node(3);
        Node leftRightNode = new Node(7);
        Node rightRightNode = new Node(18);
        Node rightNode = new Node(15);
        leftNode.left = leftLeftNode;
        leftNode.right = leftRightNode;
        rightNode.right = rightRightNode;
        root.left = leftNode;
        root.right = rightNode;
  System.out.println(new TreeClass().preOrder(root, 7, 15));


    }
}
