import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    static public int[] plusOne(int []arr){
        if (arr[arr.length-1] != 9){
            arr[arr.length-1] += 1;
            return arr;
        }
        else {
            boolean flag = false;
            for (int i = arr.length-1; i>=0; i--){
                arr[i]++;
                if (arr[i] / 10 == 1){
                    arr[i] =0;
                    flag = true;
                 } else{
                    flag = false;
                    break;
                }
            }
            if (flag) {
                int res[] = new int[arr.length+1];
                res[0]=1;
                for (int i =0; i< arr.length; i++){
                    res[i+1] = arr[i];
                }
                return res;
            }
            }
        return arr;
        }
    public static void main(String[] args) {
        int arr[] = {9,8,9};
        int[] res = plusOne(arr);
        for (int i: res){
            System.out.print(" "+i);
        }
    }
}
