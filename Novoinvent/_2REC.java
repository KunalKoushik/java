import java.util.Scanner;
// print digits of a number
public class _2REC {
    static void digitprint(int num){
        if (num == 0) {
            return;
        }
        digitprint(num/10);
        System.out.println(num=num%10);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        digitprint(n);
        s.close();
    }
}
