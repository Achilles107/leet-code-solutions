public class CountToZero {
    public int[] sumZero(int n) {
        int res[] = new int[n];
        if (n%2!=0){
            int right = n / 2;
            int j = 0;
            for (int i = -right; i<=right; i++){
                res[j] = i;
                j++;
            }
        }
        else{
            int right = n/2;
            int j = 0;
            for (int i = -right; i<=right; i++){
                if (i!=0){
                    res[j] = i;
                    j++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 1;
        int res[]  = new CountToZero().sumZero(n);
        int c = 0;
        for (int r: res){
            c+=r;
        }
        System.out.println(c);
    }
}
