import java.util.Scanner;

public class JailCandy {
    public int unlucky(int n, int m, int s){
        int i = s;
        while (m!=0){
            m--;
            i++;
            if (i > n)
                i=1;
        }
        return i-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(new JailCandy().unlucky(n,m,s));
    }
}
