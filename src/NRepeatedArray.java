import java.util.Arrays;

public class NRepeatedArray {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        for(int i=0; i< A.length; i++){
            if (A[i]==A[i+1]){
                return A[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,1,5,2,5,3,5,4} ;
        System.out.println(new NRepeatedArray().repeatedNTimes(arr));
    }
}
