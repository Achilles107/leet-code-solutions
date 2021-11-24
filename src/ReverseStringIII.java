import java.util.Scanner;

public class ReverseStringIII {
    public String reverseWords(String s) {
        if (s.length()==1)
            return s;
        String arr[] = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i =0; i < arr.length; i++){
            builder.append((new StringBuilder(arr[i]).reverse()).toString());
            builder.append(" ");
        }
        return builder.toString().trim();
    }
    public static void main(String[] args) {
        String string = "Let's take LeetCode contest";
        System.out.println(new ReverseStringIII().reverseWords(string));
    }
}
