public class DecToHExa {
    public String toHex(int num) {
        char[] hexa = new char[100];
        int i =0;
        while(num != 0){
            int temp =0;
            temp = num % 16;
            if(temp<10){
                hexa[i] = (char) (temp+48);
                i++;
            } else{
                hexa[i] = (char) (temp+87);
                i++;
            }
            num/=16;
        }
        StringBuilder result = new StringBuilder();
        for(int j = i-1; j>=0; j--){
            result.append(hexa[j]);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int n = 90;
        System.out.println(new DecToHExa().toHex(n));
    }
}
