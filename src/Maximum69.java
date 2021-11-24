public class Maximum69 {
    public int maximum69Number (int num) {
        StringBuilder str = new StringBuilder(num+"");
        for(int i =0; i < str.length(); i++){
            if (str.charAt(i) == '6'){
                str.replace(i,i+1, "9");
                break;
            }
        }
        return Integer.parseInt(str.toString());
    }
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(new Maximum69().maximum69Number(num));
    }
}
