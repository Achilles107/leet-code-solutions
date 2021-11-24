import java.util.ArrayList;
import java.util.List;

public class BuildArrayWIthStackOperation {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int j =0;
        for (int i =1; i <=n; i++){
            if (j<target.length) {
                if (target[j] != i) {
                    list.add("Push");
                    list.add("Pop");
                } else {
                    j++;
                    list.add("Push");
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int target[] = {1,2};
        int n = 4;
        System.out.println(new BuildArrayWIthStackOperation().buildArray(target, n));
    }
}
