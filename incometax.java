import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual salary: ");
        double income = sc.nextDouble();
        double tax=0;
        if (income <= 10000) {
            tax = 0;
        } else if (income <= 20000) {
            tax = income * 0.10;
        } else if (income <= 30000) {
            tax = income * 0.15;
        } else {
            tax = income * 0.25;
        }
        System.out.println("Your tax is "+tax);
        sc.close();
}
}
