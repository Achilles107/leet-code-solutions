import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CanMakeArithematicProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if (arr.length == 1)
            return true;
        else{
            int diff = arr[1] - arr[0];
            for (int i =1; i< arr.length-1; i++){
                if (arr[i+1] - arr[i] != diff)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(new CanMakeArithematicProgression().canMakeArithmeticProgression(arr));
    }
}
