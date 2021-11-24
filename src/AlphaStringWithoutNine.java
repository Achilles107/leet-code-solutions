import java.util.Scanner;

public class AlphaStringWithoutNine {
    boolean hasNine(int n) {
        while (n !=0) {
            int rem = n % 10;
            if (rem == 9)
                return true;
            n /= 10;
        }
        return false;
    }
    public int notNine(String line) {
        int largest = Integer.MIN_VALUE;
        String arr[] = line.split(" ");
        for (int i =0; i<arr.length; i++){
            try {
                int number = Integer.parseInt(arr[i]);
                if (!hasNine(number)) {
                    largest = Math.max(largest, number);
                }
            } catch (Exception e) {
                continue;
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-->0){
            String line = sc.nextLine();
            System.out.println(new AlphaStringWithoutNine().notNine(line));
        }

    }
}
