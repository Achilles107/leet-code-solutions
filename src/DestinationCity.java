import java.util.ArrayList;
import java.util.List;

public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        String destCity = paths.get(0).get(1);
        for (int i = 1; i< paths.size();){
            if(paths.get(i).get(0).contains(destCity)){
                destCity = paths.get(i).get(1);
                i = 1;
            } else {
                i++;
            }
        }
        return destCity;
    }
    public static void main(String[] args) {
        List<List<String>> cities = new ArrayList<>();

        List<String> list3 = new ArrayList<>();
        list3.add("C");
        list3.add("A");

        cities.add(list3);
        System.out.println(new DestinationCity().destCity(cities));

    }
}
