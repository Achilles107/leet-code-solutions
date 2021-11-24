import java.util.*;

public class SortByFreq {
    void sortByFreq(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i: arr){
            int count = map.getOrDefault(i, 0);
            map.put(i, count+1);
            list.add(i);
        }
        SortComp sortComp = new SortComp(map);
        Collections.sort(list, sortComp);
        for (int i = 0; i<=list.size()-1; i++){
            System.out.print(" "+list.get(i));
        }
    }
    public static void main(String[] args) {
        int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };
        new SortByFreq().sortByFreq(array);
    }
}
class SortComp implements Comparator<Integer>{
    HashMap<Integer, Integer> map = new HashMap<>();
    public SortComp(HashMap<Integer, Integer> map){
        this.map = map;
    }
    @Override
    public int compare(Integer o1, Integer o2) {
        int freq = map.get(o2).compareTo(map.get(o1));
        int valIdx = o1.compareTo(o2);
        if (freq == 0)
            return valIdx;
        else
            return freq;
    }
}