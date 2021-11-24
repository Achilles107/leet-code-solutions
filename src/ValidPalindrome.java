public class ValidPalindrome {
    public boolean isPalindrome(String str) {
        StringBuilder trimmed = new StringBuilder();
        for (int i =0; i<str.length(); i++){
            if ((Character.toLowerCase(str.charAt(i))>='a' && Character.toLowerCase(str.charAt(i))<='z') || (Character.toLowerCase(str.charAt(i))>='0') && Character.toLowerCase(str.charAt(i))<='9'){
                trimmed.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        String actual = trimmed.toString();
        return actual.equals(trimmed.reverse().toString());
    }
    public static void main(String[] args) {
        String str = "0P";

        System.out.println(new ValidPalindrome().isPalindrome(str));
    }
}
