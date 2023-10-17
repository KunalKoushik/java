import java.util.*;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int num = sc.nextInt();
        int temp = num;
        int c = 0;
        int rem;
        int sum=0;
        while (temp!=0) {
            temp=temp/10;
            c=c+1;
        }
        temp=num;
        while (temp>0) {
            rem = temp%10;
            sum+=Math.pow(rem,c);
            temp/=10;
        }
        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
