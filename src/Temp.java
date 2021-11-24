import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temp
{
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<>();
        list.add(1) ;
        list.add(2);
        list.add(3);
        Iterator itr = list.iterator();
        list.remove(1);
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}