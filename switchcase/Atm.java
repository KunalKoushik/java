import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Check Balance\n2.Deposit Money\n3.Withdraw Money");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();
        double balance = 2000;
        double amount = 0;

        switch (choice) {
            case 1:
                System.out.println("Balance is " + balance);
                break;
            case 2:
                System.out.print("Enter amount to deposite: ");
                amount = s.nextDouble();
                balance += amount;
                System.out.println("Updated balance is " + balance);
                break;
            case 3:

                System.out.print("Enter amount to withdraw: ");
                amount = s.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Updated balance is " + balance);
                }
                else{
                    System.out.println("Insufficient Balance!!! ");

                }
                break;

            default:
                System.out.println("Invalid Choice!!!");
                break;
        }
        s.close();
    }
}
