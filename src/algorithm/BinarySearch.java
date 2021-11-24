package algorithm;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binSearch(nums, 0, n-1, target);
    }
    int binSearch(int nums[], int l, int r, int key) {
        if (r>=l){
            int mid = l+(r-l)/2;
            if (nums[mid] == key)
                return mid;
            if (nums[mid]>key)
                return binSearch(nums, l, mid-1, key);
            else return binSearch(nums, mid+1, r, key);
        }
        return r-1;
    }

    public static void main(String[] args) {
        int []nums = {1,3,5,7};
        System.out.println(new BinarySearch().search(nums, 7));
    }

}
