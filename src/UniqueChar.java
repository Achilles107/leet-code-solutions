import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueChar {
    public int firstUniqChar(String s) {
        Set<Character> set1 = new LinkedHashSet<>();
        Set<Character> set = new LinkedHashSet<>();
        for (int i=0; i<s.length(); i++){
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                set1.add(s.charAt(i));
            } else {
                set1.remove(s.charAt(i));
            }
        }
        int idx = -1;
        Object[] obj = set1.toArray();
        if (obj.length>0) {
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) + "").equals(obj[0].toString())) {
                    idx = i;
                }
            }
        }
        return idx;
    }
    public static void main(String[] args) {
     String s = "aadadaad";
     System.out.print(new UniqueChar().firstUniqChar(s));
    }
}
