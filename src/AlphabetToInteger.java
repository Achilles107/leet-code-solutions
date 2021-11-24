public class AlphabetToInteger {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int k = 0;
        while (k<s.length()){
            if (k+2<s.length() && s.charAt(k+2)=='#'){
                result.append((char) (Integer.parseInt(s.substring(k, k+2))+96));
                k += 3;
            } else {
                result.append((char) (Integer.parseInt(s.charAt(k)+"") + 96));
                k++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";
        System.out.println(new AlphabetToInteger().freqAlphabets(str));
    }
}

