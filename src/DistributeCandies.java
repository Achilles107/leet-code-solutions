import java.util.Set;
import java.util.TreeSet;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new TreeSet<>();
        for (int i: candyType){
            set.add(i);
        }
        int candiesSheCanEat = candyType.length/2;
        if (set.size() > candiesSheCanEat)
            return candiesSheCanEat;
        else
            return set.size();
    }
    public static void main(String[] args) {
        int arr[] = {6,6,6,6};
        System.out.println(new DistributeCandies().distributeCandies(arr));

    }
}
