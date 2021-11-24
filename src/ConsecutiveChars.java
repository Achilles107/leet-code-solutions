public class ConsecutiveChars {
    public int maxPower(String s) {
        if (s.length() == 1)
            return 1;
        int deg = 1;
        int maxDeg = 1;
        for (int i =0; i<s.length(); i++){
            if (i < s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                deg += 1;
            } else {
                deg = 1;
            }
            maxDeg = Math.max(deg, maxDeg);
        }
        return maxDeg;
    }
    public static void main(String[] args) {
        String str = "t";
        System.out.println(new ConsecutiveChars().maxPower(str));
    }
}
