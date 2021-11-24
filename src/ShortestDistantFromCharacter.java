import java.util.ArrayList;
import java.util.List;

public class ShortestDistantFromCharacter {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        List<Integer> set = new ArrayList<>();
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i)==c){
                set.add(i);
            }
        }
        int b = set.get(0);
        int e = set.get(0);
        for (int i =0; i<s.length(); i++){
            if (set.contains(i)){
                b = i;
                int secondIdx = set.indexOf(i)+1;
                if (secondIdx>=set.size())
                    e = set.get(set.indexOf(i));
                else
                    e = set.get(secondIdx);

            } else {
                int minDistance = Math.min(Math.abs(i-b), Math.abs(i-e));
                result[i] = minDistance;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        // 3 5 6 11
        String str = "aaab";
        char c = 'a';
        int res[] = new ShortestDistantFromCharacter().shortestToChar(str, c);
        for (int i =0; i < res.length; i++){
            System.out.print(" "+res[i]);
        }
    }
}
