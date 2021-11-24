import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DifferentDigits {
    boolean isDuplicateDigit(int n){
        Set<Integer> set = new LinkedHashSet<>();
        while (n !=0){
         int rem = n % 10;
         if (set.contains(rem))
             return true;
         set.add(rem);
         n /= 10;
        }
        return false;
    }
    public int differentDigits(int n, int m){
        int count = 0;
        for (int i = n; i <=m; i++) {
            if (!isDuplicateDigit(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(new DifferentDigits().differentDigits(n,m));

    }
}
