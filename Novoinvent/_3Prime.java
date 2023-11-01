import java.util.Scanner;

public class _3Prime {
    static boolean isprime(int n, int i) {
        if (i > n / 2) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isprime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        if (isprime(num, 2)) {
            System.out.println("It is prime ");
        } else {
            System.out.println("It is not prime ");
        }
        sc.close();
    }
}
