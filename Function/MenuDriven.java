import java.util.Scanner;

public class MenuDriven {
    static double Add(double num1, double num2) {
        return num1 + num2;
    }

    static double Sub(double num1, double num2) {
        return num1 - num2;
    }

    static double Mul(double num1, double num2) {
        return num1 * num2;
    }

    static double Div(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            double num1, num2;
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter first number : ");
                    num1 = s.nextDouble();
                    System.out.print("enter second number: ");
                    num2 = s.nextDouble();
                    double ans = Add(num1, num2);
                    System.out.println("Sum is " + ans +"\n");
                    break;
                case 2:
                    System.out.print("enter first number : ");
                    num1 = s.nextDouble();
                    System.out.print("enter second number: ");
                    num2 = s.nextDouble();
                    ans = Sub(num1, num2);
                    System.out.println("Difference is " + ans+"\n");
                    break;
                case 3:
                    System.out.print("enter first number : ");
                    num1 = s.nextDouble();
                    System.out.print("enter second number: ");
                    num2 = s.nextDouble();
                    ans = Mul(num1, num2);
                    System.out.println("Product is " + ans+"\n");
                    break;
                case 4:
                    System.out.print("enter first number : ");
                    num1 = s.nextDouble();
                    System.out.print("enter second number: ");
                    num2 = s.nextDouble();
                    ans = Div(num1, num2);
                    System.out.println("After Division " + ans+"\n");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }
        }
    }
}
