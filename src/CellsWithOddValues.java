public class CellsWithOddValues {
    public int oddCells(int n, int m, int[][] indices) {
        int res[][] = new int[n][m];
        int oddNums = 0;
        for (int i = 0; i<indices.length; i++){
            int row = indices[i][0];
            int col = indices[i][1];
            for (int j = 0; j<m; j++){
                res[row][j]++;
                if (res[row][j] %2 !=0 )
                    oddNums++;
                else
                    oddNums--;
            }
            for (int j = 0; j<n; j++){
                res[j][col]++;
                if(res[j][col] %2 != 0)
                    oddNums++;
                else
                    oddNums--;
            }
        }
        return oddNums;
    }
    public static void main(String[] args) {
        int indices[][] = {{0,1},{1,1}};
        int n = 2;
        int m = 3;
        System.out.println(new CellsWithOddValues().oddCells(n,m,indices));
    }
}
