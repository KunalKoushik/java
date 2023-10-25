import java.util.Scanner;

public class PerfectSquare {
    static double sqroot(double n){
        double ans;
        ans = Math.pow(n, 0.5);
        return ans;
    }
    static void isperfectsquare(int num){
        int root = (int)sqroot(num);
        if (root * root == num) {
            System.out.println("It is a perfect Square");
            System.out.println("and its root is "+root);
        }
        else{
            System.out.println("It is not a perfect Square");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        isperfectsquare(num);
        s.close();
    }
}
