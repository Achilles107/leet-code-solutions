class LNode{
    LNode next;
    int data;
    LNode(int data){
        this.data = data;
    }
}
public class Linked {
    static int len(LNode node){
        int len=0;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }
    static int binToDec(LNode node){
        int dec = 0;
        LNode temp = node;
        int i = 0;
        int len = len(node);
        while(node!=null){
            dec += node.data * Math.pow(2, len-(i+1));
            i++;
            node= node.next;
        }
        return dec;
    }
    public static void main(String[] args) {
        LNode root = new LNode(1);
        root.next = new LNode(0);
        root.next.next = new LNode(1);
        System.out.println(binToDec(root));
    }
}
