import java.util.Scanner;

public class Perfectnumber {
    static void isPerfect(int num){
        int sum = 0;
        for (int i = 0; i <num; i++) {
            if (num % i == 0) {
                sum +=i;
            } 
        }
        if (sum == num) {
            System.out.println("It is a Perfect Number");
        }else{
            System.out.println("It is not a Perfect Number");

        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        isPerfect(num);
        s.close();
    }
}
