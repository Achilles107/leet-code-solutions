public class SubArrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i =0; i < arr.length; i++){
            for (int j = i; j<arr.length; j++){
                if((j-i)%2==0){
                    for (int k =i; k<=j; k++){
                    sum += arr[k];
                    }
                    System.out.println();
                }

            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int[] arr = {10,11,12};
        System.out.println(new SubArrays().sumOddLengthSubarrays(arr));
    }
}
