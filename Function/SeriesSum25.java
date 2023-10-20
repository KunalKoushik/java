import java.util.Scanner;

public class SeriesSum25 {
    static int Sum(int n){
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += (i*10 + 2);  
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of terms: ");
        int n = s.nextInt();
        System.out.println(Sum(n));
        s.close();
    }
}
