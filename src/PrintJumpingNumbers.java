import java.util.LinkedList;
import java.util.Queue;

public class PrintJumpingNumbers {
    public static void main(String[] args) {
        int x = 40;
        PrintJumpingNumbers obj = new PrintJumpingNumbers();
        obj.printJumping(x);
    }
    private void bfs(int x, int num){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num);

        while (!queue.isEmpty()){
            num = queue.peek();
            queue.poll();
            if (num <= x){
                System.out.print(num + " ");
                int last = num % 10;

                if (last == 0){
                    queue.add((num*10) + (last+1));
                } else if(last==9){
                    queue.add((num*10) + (last-1));
                } else {
                    queue.add((num*10) + (last-1));
                    queue.add((num*10) + (last+1));
                }
            }
        }
    }
    private void printJumping(int x) {
        System.out.print("0 ");
        for (int i =1; i<=9 && i<=x; i++){
            bfs(x,i);
        }
    }
}
