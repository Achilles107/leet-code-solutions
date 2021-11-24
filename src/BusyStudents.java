public class BusyStudents {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int busyStds = 0;
        for (int i = 0; i<startTime.length; i++){
            if (startTime[i]<=queryTime && endTime[i]>=queryTime)
                busyStds++;
        }
        return busyStds;
    }
    public static void main(String[] args) {
        int start[] = {9,8,7,6,5,4,3,2,1};
        int end[] = {10,10,10,10,10,10,10,10,10};
        int queryTime = 5;
        System.out.println(new BusyStudents().busyStudent(start, end, queryTime));
    }
}
