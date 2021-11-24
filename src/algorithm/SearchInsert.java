package algorithm;

public class SearchInsert {
    int pos = 0;
    public int searchInsert(int[] nums, int target) {
        return binSearch(nums, 0, nums.length-1, target);
    }
    int binSearch(int nums[], int l, int r, int key) {

        if (r>=l){
            int mid = l + (r-l)/2;
            if (nums[mid] == key)
                return mid;
            if (nums[mid]>key) {
                pos = mid;
                return binSearch(nums, l, mid-1, key);
            }
            else {
                pos = mid +1;
                return binSearch(nums, mid+1, r, key);
            }

        }
        return pos;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,7,9};
        System.out.println(new SearchInsert().searchInsert(arr, 0));
    }
}
