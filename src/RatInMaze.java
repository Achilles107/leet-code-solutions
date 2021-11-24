public class RatInMaze {
   static int N;
    public static void main(String[] args) {
        RatInMaze rat = new RatInMaze();
        int maze[][] = { { 1, 1, 0, 0 },
                        { 1, 1, 1, 1 },
                        { 1, 1, 1, 0 },
                        { 1, 1, 1, 1 } };

        N = maze.length;
        rat.solveMazes(maze);
    }

    boolean safe(int[][] maze, int x, int y){
        return x>=0 && x<N && y>=0 && y<N && maze[x][y] ==1;
    }
    boolean solveRecs(int[][] maze, int x, int y, int sol[][]){
        if (x==N-1 && y==N-1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }
        if (safe(maze, x, y)){
            sol[x][y] =1;
            if (solveRecs(maze, x+1, y, sol))
                return true;
            if (solveRecs(maze, x, y+1, sol))
                return true;
            sol[x][y] =0;
            return false;
        }
        return false;
    }
    void solveMazes(int[][] maze){
        int[][] sol = new int[N][N];
        if (!solveRecs(maze, 0, 0, sol)){
            System.out.println("Trapped");
            return;
        }
        printSol(sol);
    }
    boolean isSafe(int[][] maze, int x, int y){
        return x>=0 && x < N && y>=0 && y<N
                && maze[x][y] == 1;
    }
    boolean solveRec(int[][] maze, int x, int y, int sol[][]){
        if (x == N-1 && y==N-1 && maze[x][y]==1){
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y)){
            sol[x][y] = 1;
            if (solveRec(maze, x+1, y, sol))
                return true;
            if (solveRec(maze, x, y+1, sol))
                return true;

            sol[x][y] = 0;
            return false;
        }
        return false;
    }
    private void solveMaze(int[][] maze) {
        int sol[][] = new int[N][N];
        if (!solveRec(maze, 0, 0, sol)){
            System.out.println("Trapped ");
            return;
        }
        printSol(sol);
    }

    private void printSol(int[][] sol) {
        for (int i =0; i< N; i++){
            for (int j =0; j< N; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
}
