import java.util.Scanner;

public class digitsum {
    static int sum = 0;
    static void sum_digit(int n){
        if (n <= 0) {
            return;
        }
        sum += n%10;
        sum_digit(n/10);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = s.nextInt();
        sum_digit(n);
        System.out.println("Sum of digits is: "+sum);
        s.close();
    }
}
