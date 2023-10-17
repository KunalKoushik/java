import java.util.Scanner;

public class Salary_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        float salary = sc.nextFloat();

        double hra = salary*0.3;
        double ta = salary*0.2;
        double da = salary*0.1;
        double pf = 1500;

        double netSalary = salary + hra + da + ta - pf;
        System.out.println("Net Salary is " + netSalary);
        sc.close();

    }
}
