public class MergedSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIdx = nums1.length-1;
        m= m-1;
        n = n-1;
        while (m >=0 && n >=0) {
            if (nums1[m] < nums2[n]){
                nums1[lastIdx] = nums2[n];
                lastIdx--;
                n--;
            } else {
                nums1[lastIdx] = nums1[m];
                lastIdx--;
                m--;
            }
        }
        while (m >=0) {
            nums1[lastIdx--] = nums1[m--];
        }
        while (n >=0){
            nums1[lastIdx--] = nums2[n--];
        }
    }
    public static void main(String[] args) {
        int nums1[] = {0};
        int m = 0;
        int []nums2 = {1};
        int n = 1;
        new MergedSortedArray().merge(nums1, m, nums2, n);
        for (int i: nums1){
            System.out.println(i);
        }
    }
}
