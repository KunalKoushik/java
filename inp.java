import java.util.*;
public class inp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        char m = sc.next().charAt(0);
        System.out.println(m);
        Scanner s = new Scanner(System.in);
        System.out.println("enter the Number: ");
        String str= s.nextLine();
        System.out.println(str);
        sc.close();
        s.close();
    }
}
