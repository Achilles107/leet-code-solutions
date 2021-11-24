import java.util.Scanner;

public class DifferenceOfDaigonals {
    public int diff(int[][] arr, int n){
        int sum1 = 0;
        int sum2 = 0;
        for (int i =0; i<n; i++){
                sum1 += arr[i][i];
                sum2 += arr[i][n-i-1];
        }
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(new DifferenceOfDaigonals().diff(arr, n));

    }
}
