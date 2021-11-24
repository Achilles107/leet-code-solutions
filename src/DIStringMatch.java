public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int i = 0;
        int k = 0;
        int j = S.length();
        int[] res = new int[S.length()+1];
        while (i<S.length()){
            if (S.charAt(i) == 'I'){
                res[i] = k;
                k++;
            } else {
                res[i] = j;
                j--;
            }
            i++;
        }
        res[S.length()] = k;
        return res;
    }
    public static void main(String[] args) {
        String S = "DID";
        int[] res = new DIStringMatch().diStringMatch(S);
        for (int i: res){
            System.out.print(" " + i);
        }
    }
}
