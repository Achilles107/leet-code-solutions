import java.util.*;

public class RichestCustomerWealth {

    public static void main(String[] args) {
    StringBuilder str = new StringBuilder("RLRRRLLRLL");
    int bal = 0;
    int splitCount = 0;
    for (int i =0; i<str.length(); i++){
        if (str.charAt(i) == 'L')
            bal++;
        else
            bal--;
        if (bal == 0)
            splitCount++;
    }
    System.out.println(splitCount);
    }
}
