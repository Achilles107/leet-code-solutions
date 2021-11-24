public class ReverseString {
    String reverse(String str, int n){
        if (n == 1){
            return str.charAt(n-1)+"";
        }
        else {
            return str.charAt(n-1) + "" +reverse(str, n-1);
        }
    }
    public static void main(String[] args) {
        String str  = "Abhinav";
        System.out.println("current " + str + " reversed " +new ReverseString().reverse(str, str.length()));
    }
}
