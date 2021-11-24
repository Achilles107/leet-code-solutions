import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int sortArray[] = new int[heights.length];
        for (int i =0; i<sortArray.length; i++){
            sortArray[i] = heights[i];
        }
        Arrays.sort(sortArray);
        int count = 0;
        for (int i =0; i<heights.length; i++){
            if (heights[i] != sortArray[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
    int heights[] = {1,2,3,4,5};
    System.out.println(new HeightChecker().heightChecker(heights));
    }
}
