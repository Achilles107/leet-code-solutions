import java.util.Scanner;

public class TargetSum {
    public int countPairs(int arr[], int t){
        int pairs =0;
        for (int i =0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (Math.abs(arr[i]-arr[j])==t)
                    pairs++;
            }
        }

        return pairs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 46, 70, 106};
        int target = 36;
        System.out.println(new TargetSum().countPairs(arr, target));
    }
}
