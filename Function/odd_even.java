import java.util.Scanner;

public class odd_even {
    public static void odd_even(int num){
     if(num%2==0){
    System.out.println("no is even");
        }
        else {
            System.out.println("odd");
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        odd_even(num);
        sc.close();

    }
}
    
