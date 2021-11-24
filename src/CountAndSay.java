public class CountAndSay {

    public String countAndSay(int n) {
        if (n==1)
            return "1";
        else {
            String inp = countAndSay(n-1);
            int count = 1;
            StringBuilder result = new StringBuilder();
            for (int i =1; i< inp.length(); i++){
                if (inp.charAt(i) == inp.charAt(i-1)){
                    count++;
                } else {
                    result.append(count);
                    result.append(inp.charAt(i-1));
                    count = 1;
                }
            }
            result.append(count);
            result.append(inp.charAt(inp.length()-1));
            return result.toString();
        }

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(new CountAndSay().countAndSay(n));
    }

}
