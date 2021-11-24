public class OnesComplement {
    public int bitwiseComplement(int N) {
        if (N == 0)
            return 1;
        int bits  = (int) (Math.floor(Math.log(N)/Math.log(2)) +1);
        return ((1 << bits) - 1) ^ N;
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(new OnesComplement().bitwiseComplement(n));
    }
}
