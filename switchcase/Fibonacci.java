import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = s.nextInt();
        int first = 0;
        int sec = 1;
        int next = 0;
        for (int i = 0; i < num; i++) {
            if (i <= 1) {
                next = i;
            }
            else{
                next = first + sec;
                first = sec;
                sec = next;
            }
            System.out.print(next+" ");
        }

    }
}
