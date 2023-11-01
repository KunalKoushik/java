import java.util.Scanner;

public class _12Pattern {
        static void printcol(int row,int col){
        if (col == 0) {
            return;
        }
        printcol(row,col-1);
        if (col < row ) {
            System.out.print(" ");
        }else{
            System.out.print("*");
        }
    }
    static void printstar(int row,int col){
        if (row == 0) {
            return;
        }
        printcol(row,col);
        System.out.println();
        printstar(row-1,col);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = s.nextInt();
        printstar(row,row); 
        s.close();
    }
}
