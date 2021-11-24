public class SubstringOfAString {
    void printAllStrings(String s){
        for (int i =0; i< s.length(); i++){
            for (int j = i+1; j<=s.length(); j++){
                if(s.substring(i,j).contains("0") && s.substring(i,j).contains("1") && s.substring(i,j).length()%2==0){
                    System.out.println(s.substring(i,j));
                }

            }
        }

    }
    public static void main(String[] args) {
        String string = "00110011";
        new SubstringOfAString().printAllStrings(string);
    }
}
