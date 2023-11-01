import java.util.Scanner;

public class _1recurrsion{
    static void print(int n){
        if (n ==0) {
            return;
        }
        print(n-1);
        if (n%2 == 0) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = s.nextInt();
        print(n);
        s.close();
        
    }
}