import java.util.LinkedHashSet;
import java.util.Set;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
       if (strs.length ==0)
           return "";
       String prefix = strs[0];
        for (int i =1; i< strs.length; i++){
            System.out.println(strs[i].indexOf(prefix));
           while (strs[i].indexOf(prefix) != 0){
               prefix = prefix.substring(0, prefix.length()-1);
               if (prefix.isEmpty())
                   return "";
           }
       }
        return prefix;
    }
    public static void main(String[] args) {
        String strs[] = {"flower","flower", "flying"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));

    }
}
