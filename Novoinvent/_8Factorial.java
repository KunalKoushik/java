import java.util.Scanner;

public class _8Factorial {
    static int Fact(int num){
        if (num == 0) {
            return 1;
        }
        return num*Fact(num-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        System.out.println(Fact(num));
        s.close();
    }
}
