public class MoveZeros {
    static int[] move(int nums[]){
        if (nums.length==1)
            return nums;
        int j =0;
        for (int i =0; i< nums.length; i++){
            if (nums[i] !=0){
                nums[j] = nums[i];
                j++;
            }
        }
        while (j< nums.length){
            nums[j++] =0;
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int[] res = move(arr);
        for (int i: res){
            System.out.print(" "+i);
        }
    }
}
