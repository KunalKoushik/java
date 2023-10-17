import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int i = 2;
        for (; i < num/2 ; i++) {
            if (num % i == 0) {
                System.out.println("Not a Prime Number ");
                break;
            }
        }
        if (i >= num/2) {
            System.out.println("A Prime Number ");
        }
    }
}
