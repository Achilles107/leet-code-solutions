public class BadVersion {
    public int firstBadVersion(int n) {
        int mid = n/2;
        if (isBadVersion(1))
            return 1;
        if (!isBadVersion(n))
            return 0;
        return bad(1,n);
    }

    public int bad(int l, int r){
        int mid = (l+r)/2;
        if (isBadVersion(mid)){
            if (mid-l == 1){
                return mid;
            } else {
                 return bad(l, mid);
            }
        } else {
            if (r-mid == 1){
                return r;
            }
            return bad(mid, r);
        }
    }
    public static void main(String[] args) {
     int n = 4;
     System.out.println(new BadVersion().firstBadVersion(n));
    }

    private static boolean isBadVersion(int n) {
        if (n >= 1)
            return true;
        return false;
    }
}
