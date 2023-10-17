import java.util.Scanner;
public class AreaRec {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        // System.out.println(n%2 == 0 ?"EVEN" :"ODD");
        
        // System.out.println("Enter the number1 ");
        // int num1 = sc.nextInt();
        
        // System.out.println("Enter the number2 ");
        // int num2 = sc.nextInt();
        
        // System.out.println("Enter the number3 ");
        // int num3 = sc.nextInt();
        
        // System.out.println(num1 > num2 ? (num1>num3?num1+"is greater":num3+"is greater") :(num2>num3?num2+" is greater":num3+"is greater"));

        //swap
        // System.out.println("Enter the number1 ");
        // int var1 = sc.nextInt();
        // System.out.println("Enter the number2 ");
        // int var2 = sc.nextInt();
        
        // var1 += var2;
        // var2 = var1-var2;
        // var1 = var1-var2;
        // System.out.println("After Swap var1 is "+var1+" var 2 is "+var2);

        //area of rectangle
        
        System.out.println("Enter the length ");
        int L = sc.nextInt();
        System.out.println("Enter the breadth ");
        int B = sc.nextInt();
        
        System.out.println("Area is "+(L*B));
        


        sc.close();
    }
    
}
