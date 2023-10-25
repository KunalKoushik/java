import java.util.Scanner;

public class count_odd_even {
    static void oddevendigit(int num){
        while (num >0) {
            int digit = num%10;
            if (digit%2 == 0) {
                System.out.println(digit+" is Even ");
            }else{
                System.out.println(digit+" is Odd");
            }
            num/=10;
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int num = s.nextInt();
        oddevendigit(num);

    }
}
