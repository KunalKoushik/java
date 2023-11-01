import java.util.Scanner;

public class _11Pattern {
    static void printcol(int row,int col,int n){
        if (col == 0) {
            return;
        }
        if (row == 1 || col == 1 || row == n || col == n) {
            
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        printcol(row,col-1,n);
    }
    static void printstar(int row,int col,int n){
        if (row == 0) {
            return;
        }
        printcol(row,col,n);
        System.out.println();
        printstar(row-1,col,n);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = s.nextInt();
        printstar(row,row,row); 
        s.close();
    }
}
