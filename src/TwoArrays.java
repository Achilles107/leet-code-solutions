public class TwoArrays {
    public int[] create2ndArr(int nArr[], int[] nPlusMArr){
        int fidx = 0;
        int sidx = nArr.length;
        int i =0;
        while (fidx < nArr.length && sidx < nPlusMArr.length){
            if (nArr[fidx] < nPlusMArr[sidx]){
                nPlusMArr[i] = nArr[fidx];
                fidx++;
            } else {
                nPlusMArr[i] = nPlusMArr[sidx];
                sidx++;
            }
            i++;
        }
        while (fidx < nArr.length){
            nPlusMArr[i++] = nArr[fidx++];
        }
        while (sidx < nPlusMArr.length){
            nPlusMArr[i++] = nPlusMArr[sidx++];
        }
        return nPlusMArr;
    }
    public static void main(String[] args) {
        int[] nArr = {2,7,13,45,80,99};
        int[] nPlusMArr = {0,0,0,0,0,0,1,5,15,75,90};
        int res[] = new TwoArrays().create2ndArr(nArr, nPlusMArr);
        for (int n: res){
            System.out.print(" "+n);
        }
    }
}