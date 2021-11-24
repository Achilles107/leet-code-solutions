public class StringHalves {
    public int isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return 1;
        return 0;
    }

    public int numOfVowels(String s, int n) {
        if (n == 1)
            return isVowel(s.charAt(n - 1));
        return isVowel(s.charAt(n - 1)) + numOfVowels(s, n - 1);
    }

    public boolean halvesAreAlike(String s) {
        if (numOfVowels(s.substring(0, s.length() / 2), s.length() / 2) == numOfVowels(s.substring(s.length() / 2, s.length()), s.length() - (s.length() / 2))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 4
        String str = "AbCdEfGh";
        System.out.println(new StringHalves().halvesAreAlike(str));
    }
}
