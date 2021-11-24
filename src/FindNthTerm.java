import java.util.Scanner;

public class FindNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0){
            int num = (int) Math.pow(2, n/2);
            System.out.println(num);
        } else {
            int num = (int) Math.pow(3, (n/2)-1);
            System.out.println(num);
            
        }
    }
}
