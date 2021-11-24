public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int i = 0;
        int j = 0;
        for (int k = 0; k<moves.length(); k++){
            if (moves.charAt(k)=='U')
                j++;
            else if (moves.charAt(k)=='D')
                j--;
            else if (moves.charAt(k)=='L')
                i--;
            else if (moves.charAt(k)=='R')
                i++;
        }
        if (i == 0 && j==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        String moves = "LDRRLRUULD";
        System.out.println(new RobotReturnToOrigin().judgeCircle(moves));
    }
}
