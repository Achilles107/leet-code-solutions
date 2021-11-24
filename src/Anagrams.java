import java.util.ArrayList;
import java.util.List;

public class Anagrams {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        int count[] = new int[256];
        for (int i =0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i =0; i<256; i++){
            if (count[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "carr";
        String t = "aacr";
        System.out.print(new Anagrams().isAnagram(s, t));

    }
}
