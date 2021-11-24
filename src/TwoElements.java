import java.util.Arrays;

public class TwoElements {
    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 20, 70, -80, 85};
        int n = arr.length;
        Arrays.sort(arr);
        minSum(arr, n);
    }

    private static void minSum(int arr[], int n){
        int sum, min_sum = Integer.MAX_VALUE;
        int l=0, min_l=l;
        int r = n-1, min_r = r;
        if (n<2){
            return;
        }
        while (l<r){
            sum = arr[l]+arr[r];
            if (Math.abs(sum) < Math.abs(min_sum)){
                min_sum = sum;
                min_l = l;
                min_r =  r;
            }
            if (sum<0)
                l++;
            else
                r--;
        }
        System.out.println(arr[min_l] + "  "+arr[min_r]);
    }
    private static void minAbsSumPair(int[] arr, int n) {
        int sum , min_sum = Integer.MAX_VALUE;
        int l = 0, min_l=l;
        int r = n - 1, min_r = n-1;
        while (n<2){
            System.out.println("Wrong inputs");
            return;
        }
        while (l<r){
            sum = arr[l] + arr[r];
            if (Math.abs(sum) < Math.abs(min_sum)) {
                min_sum = sum;
                min_l = l;
                min_r = r;
            }
            if (sum < 0)
                l++;
            else
                r--;
        }
        System.out.print(arr[min_l] + " " + arr[min_r]);


    }
}
