public class GreatestOnRight {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length-1; i>=0; i--){
            int val = arr[i];
            arr[i] = max;
            max = Math.max(max, val);
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1} ;
        int res[] = (new GreatestOnRight().replaceElements(arr));
        for(int n: res){
            System.out.println(n);
        }
    }
}
