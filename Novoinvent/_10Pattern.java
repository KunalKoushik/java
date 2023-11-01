import java.util.Scanner;

public class _10Pattern {
    static void printcol(int col){
        if (col == 0) {
            return;
        }
        System.out.print("*");
        printcol(col-1);
    }
    static void printstar(int row,int col){
        if (row == 0) {
            return;
        }
        printcol(col);
        System.out.println();
        printstar(row-1,col+1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = s.nextInt();
        printstar(row,1); 
        s.close();
    }
}
