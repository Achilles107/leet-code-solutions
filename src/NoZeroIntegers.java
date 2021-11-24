public class NoZeroIntegers {
    public int[] getNoZeroIntegers(int n) {
         int[] integers = new int[2];
         for (int i = n-1; i>0; i--){
             if (!(String.valueOf(i).toString()).contains("0") && !(String.valueOf(n-i).toString()).contains("0")){
                 integers[1] = i;
                 integers[0] = n-i;
                 break;
             }
         }
         return integers;
    }
    public static void main(String[] args) {
        int n = 4102;
        int arr[] = new NoZeroIntegers().getNoZeroIntegers(n);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
