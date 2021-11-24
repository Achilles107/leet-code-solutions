public class MaxProduct {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i =0; i< nums.length; i++){
            if (max <= nums[i]){
                secondMax = max;
                max = nums[i];
            } else if(nums[i]>secondMax && nums[i]!=max){
                secondMax = nums[i];
            }
        }
        return ((max-1)*(secondMax-1));
    }
    public static void main(String[] args) {
        int arr[] = {10,2,5,2};
        System.out.println(new MaxProduct().maxProduct(arr));
    }
}
