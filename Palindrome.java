import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int m = sc.nextInt();
        int temp = m;
        int r=0;
        while (m!=0) {
            r=(r*10)+(m%10);
            m=m/10;            
        }
        if (r==temp) {
            System.out.println("No is palindrome ");
        }
        else{
            System.out.println("No is not palindrome ");
        }
        sc.close();
    }
}
