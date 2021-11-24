public class FreqString {
    int freq(String s){
        if (s.length()==1)
            return 1;
        int count[] = new int[256];
        for (int i=0; i<s.length(); i++){
            count[s.charAt(i)]++;
        }
        int min = 0;
        for (int i ='a'; i< count.length; i++){
            if(count[i] !=0){
                min = count[i];
                break;
            }
        }
        return min;
    }
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int res[] = new int[queries.length];
        int word[] = new int[words.length];
        int query[] = new int[queries.length];
        for (int i=0; i<queries.length; i++){
            query[i] = freq(queries[i]);
        }
        for (int i=0; i<words.length; i++){
            word[i] = freq(words[i]);
        }
        for (int i =0; i<query.length; i++){
            int count = 0;
            for (int j=0; j<word.length; j++){
                if (query[i]<word[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
    public static void main(String[] args) {
        String queries[] = {"bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"};
        String words[] = {"aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"};

        int res[] = new FreqString().numSmallerByFrequency(queries, words);
        for (int i: res){
            System.out.println(i);
        }
    }
}

/*
["bba","abaaaaaa","aaaaaa","bbabbabaab","aba","aa","baab","bbbbbb","aab","bbabbaabb"]
["aaabbb","aab","babbab","babbbb","b","bbbbbbbbab","a","bbbbbbbbbb","baaabbaab","aa"]
* */