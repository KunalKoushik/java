import java.util.Scanner;
public class Greater3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        // System.out.println(n%2 == 0 ?"EVEN" :"ODD");
        
        System.out.println("Enter the number1 ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter the number2 ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter the number3 ");
        int num3 = sc.nextInt();
        
        System.out.println(num1 > num2 ? (num1>num3?num1+"is greater":num3+"is greater") :(num2>num3?num2+" is greater":num3+"is greater"));

        sc.close();

}

}
