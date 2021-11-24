import java.util.Scanner;

/**
 * Class to Remove 7 and 56 from a given String
 * There is a catch here, the questions says, remove 7 and 56
 * but you can't remove 7 first
 * suppose string = "abhinav57689" (only 7 is present)
 * expected output here is "abhinav5689"
 * but if we remove 7 first and then 56, it will give abhinav89
 * which is wrong.
 * So solution is to remove 56 first and then 7
 */
public class Remove7And56 {

    public static void main(String[] args) {
        // user input for String
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        str = str.replaceAll("56", ""); // replace all 56 occurrences with blank string;
        str = str.replaceAll("7", ""); // replace all 7 occurrences with blank string;
        System.out.println(str); // print the output
    }
}
