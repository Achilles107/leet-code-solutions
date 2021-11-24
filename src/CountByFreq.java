import java.util.*;


public class CountByFreq
{

    public static void main(String[] args)
    {
        int[] arr = { 3, 3, 1, 1, 1, 8, 3, 6, 8, 7, 8, 8 };

        customSort(arr);
    }

    private static void customSort(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int i =0; i< arr.length; i++){
            int count = map.getOrDefault(arr[i], 0);
            map.put(arr[i], count+1);
            res.add(arr[i]);
        }
        SortCompare sortCompare = new SortCompare(map);
        Collections.sort(res, sortCompare);
        for (int i: res){
            System.out.print(" " + i);
        }

    }
}

class SortCompare implements Comparator<Integer>{
    HashMap<Integer, Integer> map = new HashMap<>();
    SortCompare(HashMap<Integer, Integer> map){
        this.map = map;
    }
    @Override
    public int compare(Integer o1, Integer o2) {
        int res = map.get(o2).compareTo(map.get(o1));
        int idx = o1.compareTo(o2);
        if (res == 0)
            return idx;
        return res;
    }
}