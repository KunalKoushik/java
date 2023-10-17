import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < row; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                for (int j = i; j < 5; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j >= 0; j--) {
                    System.out.print("*");

                }

                for (int k = 0; k <3; k++) {
                    System.out.print(" ");

                }
                for (int l = 0; l >= 0; l--) {
                    System.out.print("*");

                }
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        sc.close();
    }
}
