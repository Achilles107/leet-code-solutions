public class PeakIndex {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr.length == 0)
            return -1;
        if (arr.length == 1)
            return 0;
        else
            return search(arr, 0, arr.length-1);
    }

    int search(int arr[], int s, int e){
        if (s<=e){
            int mid = s + (e-s) / 2;
            if (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
                return mid;
            else if (arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])
                return search(arr, s, mid-1);
            else
                return search(arr, mid+1, e);
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {3,4,5,1};
        System.out.println(new PeakIndex().peakIndexInMountainArray(arr));
    }
}
