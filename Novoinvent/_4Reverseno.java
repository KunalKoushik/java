import java.util.Scanner;

public class _4Reverseno {
    static int rev = 0;
    static int reverse(int num){
        if (num == 0) {
            return rev;
        }
        rev = rev*10 + num%10;
        // System.out.print(n);
        return reverse(num/10);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        reverse(num);
        System.out.println(rev);
        s.close();
    }
}
