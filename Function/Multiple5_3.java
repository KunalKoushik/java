import java.util.Scanner;

public class Multiple5_3 {
    static void SUM(int n){
        int sum = 0;
        for (int i = 0; i<= n; i++) {
            if (i%3 == 0 || i%5 == 0 ) {
                sum += i;
            }
        }
        System.out.println("Sum of multiples is "+sum);
    }
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the Range: ");
    int n = s.nextInt();
    SUM(n);
    s.close();
 }   
}
