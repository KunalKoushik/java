import java.util.Scanner;
public class Swap {



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //swap
        System.out.println("Enter the number1 ");
        int var1 = sc.nextInt();
        System.out.println("Enter the number2 ");
        int var2 = sc.nextInt();
        
        var1 += var2;
        var2 = var1-var2;
        var1 = var1-var2;
        System.out.println("After Swap var1 is "+var1+" var 2 is "+var2);



        sc.close();
    }
    


}
