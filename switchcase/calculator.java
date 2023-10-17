

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();
        System.out.print("enter num 1: ");
        double num1 = s.nextDouble();
        System.out.print("enter num 2: ");
        double num2 = s.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("sum is " + (num1 + num2));
                break;
            case 2:
                System.out.println("sum is " + (num1 - num2));
                break;
            case 3:
                System.out.println("sum is " + (num1 * num2));
                break;
            case 4:
                System.out.println("sum is " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Choice!!!");
                break;
        }
        s.close();
    }
}
