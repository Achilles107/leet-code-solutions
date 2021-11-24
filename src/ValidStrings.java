public class ValidStrings {
    boolean validateString(String fstr, String sstr){
        if (fstr.length() > sstr.length())
            return false;
        int maxChars = 0;
        for (int i =0; i<fstr.length(); i++){
            if (fstr.charAt(i) == '*')
                maxChars += 2;
            else if (fstr.charAt(i) == '_')
                maxChars += 1;
        }
        int missing = 0;
        for (int i =0; i< sstr.length(); i++){
            if (!fstr.contains(sstr.charAt(i)+""))
                missing++;
        }
        if (maxChars >= missing)
            return true;
        return false;
    }
    public static void main(String[] args) {
        String valString = "qw*rty_c";
        String str = "qwertyabc";
        System.out.print(new ValidStrings().validateString(valString, str));
    }
}
