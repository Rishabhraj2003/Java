package Backtracking;

public class mazepath {
    public static void main(String[] args) {
        int rows=2;
        int cols=2;
        int count=maze(1,1,rows,cols);
        System.out.println(count);
    }

    private static int maze(int r, int c, int rows,int cols ){
        if(r>rows || c>cols) return  0;
        if(r==rows && c==cols) return 1;
        int downways=maze(r+1,c,rows,cols);
        int rightways=maze(r,c+1,rows,cols);
        int totalways= downways+rightways;

return totalways;
    }

}
