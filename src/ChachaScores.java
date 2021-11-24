import java.util.ArrayList;
import java.util.List;

public class ChachaScores {
    public int[] climbing(int lb[], int chacha[]){
        List<Integer> list = new ArrayList<>();
        for (int i =0; i< lb.length; i++){
            if (!list.contains(lb[i]))
                list.add(lb[i]);
        }
        int res[] = new int[chacha.length];
        for (int i =0; i < chacha.length; i ++){
            for (int j =0; j< list.size(); j++){
                if (list.get(j) <= chacha[i]){
                    res[i] = j+1;
                    break;
                }  else if (j == list.size()-1)
                    res[i] = list.size()+1;
            }

        }
        return res;
    }
    public static void main(String[] args) {
        int lb[] = {100,90, 90, 80};
        int chacha[] = {70, 80, 105};
        int res[] = new ChachaScores().climbing(lb, chacha);
        for (int i: res){
            System.out.println(i);
        }
    }
}
