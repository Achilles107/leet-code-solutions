import java.util.Scanner;

public class DayOfPRogrammer {
    public String date(int year) {
        String date = "";
        if (year >= 1700 && year<=1917){
            if (year % 4 == 0){
                date = "12.09."+year;
            } else {
                date = "13.09."+year;
            }
        } else if (year == 1918){
            date = "26.09."+year;
        } else {
            if ((year % 400 ==0) || ((year % 4 == 0) && (year % 100 != 0))){
                date = "12.09."+year;
            } else {
                date = "13.09."+year;
            }
        }
        return date;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(new DayOfPRogrammer().date(year));
    }
}
