import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    static Queue<Integer> queue = new LinkedList<>();
    static Queue<Integer> queue1 = new LinkedList<>();
    int pop(){
        if (queue.isEmpty())
            return -1;
        int res = queue.peek();
        queue.remove();
        return res;
    }
    void push(int num){
        queue1.add(num);
        while (!queue.isEmpty()) {
            queue1.add(queue.peek());
            queue.remove();
        }

        Queue<Integer> q =  queue1;
        queue1 = queue;
        queue = q;

    }
    public static void main(String[] args) {

    }
}
