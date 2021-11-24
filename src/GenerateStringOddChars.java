public class GenerateStringOddChars {
    public String generateTheString(int n) {
        StringBuilder result = new StringBuilder();
        if (n%2==0){
            result.append('a');
            for(int i = 1; i<=n-1; i++){
                result.append('b');
            }
        } else {
            result.append('a');
            int i;
            for (i = 1; i<n-1; i++){
                result.append('b');
            }
            if (i==n-1) {
                result.append('c');
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(new GenerateStringOddChars().generateTheString(n));
    }
}
