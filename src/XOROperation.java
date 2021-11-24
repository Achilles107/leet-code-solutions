public class XOROperation {
    public int xorOperation(int n, int start) {
        int xorVal = start;
        for (int i =1; i<n; i++){
            xorVal = xorVal ^ (start+(2*i));
        }
        return xorVal;
    }
    public static void main(String[] args) {
        int n = 10;
        int start = 5;
        System.out.println(new XOROperation().xorOperation(n, start));

    }
}
