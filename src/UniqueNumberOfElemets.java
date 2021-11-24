import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNumberOfElemets {
    public boolean uniqueOccurrences(int[] arr) {
        if (arr.length==1)
            return true;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 1)+1);
        }
        Set<Integer> set = new TreeSet<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (!set.add(entry.getValue()))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2};
        System.out.println(new UniqueNumberOfElemets().uniqueOccurrences(arr));
    }
}
