import java.util.*;

public class IncreasingDecreasingString {
    public String sortString(String s) {
        StringBuilder result = new StringBuilder();
        List<Character> listOfS = new LinkedList<>();
        for (int i =0; i<s.length(); i++){
            listOfS.add(s.charAt(i));
        }

        while (listOfS.size()!=0){
            Set<Character> incr = new TreeSet<>();
            TreeSet<Character> decr = new TreeSet<>();
            for (int i =0; i< listOfS.size(); i++) {
                incr.add(listOfS.get(i));
            }
            for (Character ch: incr){
                if(listOfS.contains(ch)){
                    listOfS.remove(ch);
                }
            }
            for (int i =0; i< listOfS.size(); i++){
                decr.add(listOfS.get(i));
            }
            for (Character ch: decr){
                if(listOfS.contains(ch)){
                    listOfS.remove(ch);
                }
            }
            NavigableSet<Character> decrSet = decr.descendingSet();
            for (Character ch: incr){
                result.append(ch);
            }
            for (Character ch: decrSet){
                result.append(ch);
            }
        }
        return  result.toString();
    }
    public static void main(String[] args) {
        String str = "spo";
        System.out.println(new IncreasingDecreasingString().sortString(str));
    }
}
