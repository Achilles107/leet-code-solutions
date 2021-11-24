public class StringToInt {
    public int myAtoi(String s) {
        if (s.length()==0)
            return -1;

        StringBuilder integer = new StringBuilder();
        boolean neg = false;
        s = s.trim();
        if (s.startsWith("-")){
            neg = true;
            s = s.replaceFirst("-", "");
        } else if (s.startsWith("+")){
            s = s.replaceFirst("\\+", "");
        }
        if (s.isEmpty()){
            return 0;
        }
        if (Character.isAlphabetic(s.charAt(0)) || s.charAt(0)=='.'){
            return 0;
        }
        for (int i =0; i< s.length(); i++){
            if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == '.' || s.charAt(i) =='+' || s.charAt(i) =='-'){
                break;
            } else {
                if (s.charAt(i) != ' ') {
                    integer.append(s.charAt(i));
                }
            }
        }
        if (integer.toString().isEmpty())
            return 0;
        int result = 0;
        try {
            result = Integer.parseInt(integer.toString());
        } catch (NumberFormatException e){
            if (neg)
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
        if (neg)
            return -result;
        else
            return result;

    }
    public static void main(String[] args) {
        String str = "+";
        System.out.print(new StringToInt().myAtoi(str));
    }
}
