import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCode {
    public String convertIntoMorse(String word){
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder morseWord = new StringBuilder();
        for(int i =0; i< word.length(); i++){
            morseWord.append(morse[word.charAt(i)-97]);
        }
        return morseWord.toString();
    }
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new LinkedHashSet<>();
        for (int i =0; i< words.length; i++){
            set.add(convertIntoMorse(words[i]));
        }
        return set.size();
        /*Map<String, Integer> map = new LinkedHashMap<>();
        for(int i =0; i< words.length; i++){
            System.out.println(convertIntoMorse(words[i]));
            if (map.containsKey(convertIntoMorse(words[i]))){
                map.put(convertIntoMorse(words[i]), map.get(convertIntoMorse(words[i]))+1);
            } else{
                map.put(convertIntoMorse(words[i]), 1);
            }
        }
        int unique = 0;
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() == 1){
                unique++;
            }
        }*/
    }
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new UniqueMorseCode().uniqueMorseRepresentations(words));

    }
}
