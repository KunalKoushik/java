import java.util.*;

public class Numpattern {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of outer layer: ");
        int n = sc.nextInt();
        //upper half
        for (int i = n; i > 0; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(i + " ");

            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
            
        }

        // lower half
        for (int i = 2; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");

            }
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(i + " ");

            }
            for (int j = i + 1; j < n + 1; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
            sc.close();
        }
    }
}
