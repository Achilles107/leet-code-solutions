import java.util.ArrayList;
import java.util.List;

public class SelfDivingNUmbers {
    boolean divide(int num){
        boolean divisible = true;
        int val = num;
        while(num!=0){
            int rem = num % 10;
            if (rem==0 || val % rem != 0){
                divisible = false;
                break;
            }
            num /= 10;
        }
        return divisible;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDivNums = new ArrayList<>();
        for (int i =left; i<=right; i++){
            if (i<10){
                selfDivNums.add(i);
            } else{
                if (divide(i)){
                    selfDivNums.add(i);
                }

            }
        }
        return selfDivNums;
    }
    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(new SelfDivingNUmbers().selfDividingNumbers(left, right));
    }
}
