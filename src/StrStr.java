public class StrStr {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle))
            return -1;
        if ((haystack.length() ==0 && needle.length()==0) || (needle.length() == 0 && haystack.length()>0)){
            return 0;
        }
        if (haystack.length()<needle.length())
            return -1;
        for (int i =0; i<haystack.length(); i++){
            if (i+needle.length() > haystack.length())
                break;
            else if (haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "";
        String needle = "";
        System.out.println(new StrStr().strStr(haystack, needle));
    }
}
