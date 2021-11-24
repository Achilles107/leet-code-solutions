import java.util.Stack;

class Que{
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    static int size = 0;
    Que(){
        size++;
    }
    void enqueue(int num){
        stack2.push(num);
        while(!stack1.isEmpty()){
            stack2.push(stack2.pop());
        }
        Stack<Integer> s = stack1;
        stack1 = stack2;
        stack2 = s;
    }
    void deque(){
        if (stack1.isEmpty())
            return;
        stack1.pop();
    }
}
public class QueuesUsingStack {
    public static void main(String[] args) {
        System.out.println(Integer.compare(20, 10));
    }
}
