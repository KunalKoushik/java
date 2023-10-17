import java.util.*;
public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int m = sc.nextInt();

        int rev=0;
        while (m>0) {
            rev = (rev*10) + (m%10);
            m/=10; 
        }
        System.out.println(rev);
        sc.close();
    }
}
