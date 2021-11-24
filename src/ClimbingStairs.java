public class ClimbingStairs {

    public int climbStairs(int n) {
        int res[] = new int[n+1];
        res[0] = 1;
        res[1] = 1;
        for (int i =2; i<=n; i++){
            res[i] += res[i-1] + res[i-2];
        }

        return res[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(new ClimbingStairs().climbStairs(n));

    }
}
