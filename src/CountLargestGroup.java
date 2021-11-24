import java.util.*;

public class CountLargestGroup {
    int sumDigits(int n){
        int sum = 0;
        while(n>0){
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        int maxLength = Integer.MIN_VALUE;
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for(int i = 1; i<=n; i++){
                if (map.containsKey(sumDigits(i))) {
                    map.get(sumDigits(i)).add(i);
                    maxLength = Math.max(maxLength, map.get(sumDigits(i)).size());
                } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(i);
                        map.put(sumDigits(i), list);
                        maxLength = Math.max(maxLength, map.get(sumDigits(i)).size());
                }
        }
        System.out.println(maxLength);
        int count = 0;
        for (Map.Entry<Integer, List<Integer>> entry: map.entrySet()){
            if (entry.getValue().size() == maxLength) {
                count++;
                System.out.println(entry.getValue());
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(new CountLargestGroup().countLargestGroup(n));
    }
}
