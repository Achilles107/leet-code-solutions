public class ShiftAllOnes {
    static int[] shift(int arr[]){
        if (arr.length == 1)
            return arr;
        int i =0;
        int j = arr.length-1;
        while (i<j){
            if (arr[i]==1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            } else {
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0};
        int res[]=shift(arr);
        for (int i =0; i<res.length; i++){
            System.out.print(" "+res[i]);
        }
    }
}
