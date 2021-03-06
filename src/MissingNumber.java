public class MissingNumber {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i =0; i<nums.length; i++){
            missing ^= i ^ nums[i];
        }
        return missing;
    }
    public static void main(String[] args) {
        int nums[] = {9,6,8,2,3,5,7,0,1};
        System.out.println(new MissingNumber().missingNumber(nums));
    }
}
