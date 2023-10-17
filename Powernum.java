import java.util.Scanner;

public class Powernum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num  = s.nextInt();
        int sum =0;
        while (num > 0) {
            sum += num*num ;
            num--;
        }
        System.out.println("sum of series is : "+sum);
        s.close();
    }
}
