public class CountNegativeInMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i =0; i<grid.length; i++){
            for (int j = grid[0].length-1; j>=0 && grid[i][j]<0; j--){
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] arr = {{5,1,0},{-5,-5,-5}};
        System.out.println(new CountNegativeInMatrix().countNegatives(arr));
    }
}
