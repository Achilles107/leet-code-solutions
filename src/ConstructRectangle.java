public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        int arr[] = {area, 1};
        int L = (int) Math.sqrt(area);
        for (int i = L; i>=1; i--){
         if(area%i==0)
             return new int[] {area/i, i};
        }
        return arr;
    }
    public static void main(String[] args) {
        int area = 122122;
        System.out.println(new ConstructRectangle().constructRectangle(area));

    }
}
