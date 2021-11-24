import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeDiffSix {
    boolean isPrime(int n){
        int c = 0;
        for (int i = 2; i<=n; i++) {
            if (n%i == 0)
                c++;
            if (c >= 2)
                return false;
        }
        return true;
    }
    public int diffSix(int n, int m){
        int prime = 0;
        int count =0;
        List<Integer> list = new ArrayList<>();
        for (int i = n; i <=m; i++) {
            if (isPrime(i))
                list.add(i);
        }
        for (int i =0; i < list.size(); i++)
            for (int j = i+1; j<list.size(); j++){
                if (Math.abs(list.get(i) - list.get(j))==6)
                    count++;
            }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 30;
        System.out.println(new PrimeDiffSix().diffSix(n,m));
    }
}
