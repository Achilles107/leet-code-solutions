import java.util.Scanner;

public class TurnPages {
    public int minTurns(int n, int p){
        return Math.min(p/2, n/2 - p/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(new TurnPages().minTurns(n,p));

    }
}
