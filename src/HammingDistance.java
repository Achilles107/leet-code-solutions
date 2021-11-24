public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int res = x ^ y;
        int distance = 0;
        while (res>0){
            if ((res%2)==1)
                distance++;
            res /= 2;
        }
        return distance;
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(new HammingDistance().hammingDistance(x,y));
    }
}
