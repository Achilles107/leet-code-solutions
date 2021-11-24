import java.util.LinkedHashSet;
import java.util.Set;

public class ContainsDupl {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length==1)
            return false;
        Set<Integer> set = new LinkedHashSet<>();
        for (int i =0; i< nums.length; i++){
          if (set.contains(nums[i])){
              return true;
          }
          set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6};
        System.out.println(new ContainsDupl().containsDuplicate(arr));
    }
}
