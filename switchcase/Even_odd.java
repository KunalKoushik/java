import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print(("Enter the range:  "));
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            if (i%2 == 0) {
                System.out.println(i+" is an Even");
            }else{
                System.out.println(i+" is an Even");
            } 
        }

        s.close();
    }
}
