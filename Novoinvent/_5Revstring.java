import java.util.Scanner;

public class _5Revstring {
    //New Empty String
    static StringBuilder revstr = new StringBuilder();
    // static void reverse(String str,int i,int n){
        //     if (i == n) {
            //         return;
            //     }
            //     reverse(str,i+1, n);
            //     revstr.append(str.charAt(i));
            
            // }
    static String newrev="";
    static String reverse(String str,int n){
        if (n < 0) {
            return newrev;
        }
        newrev += str.charAt(n);
        return reverse(str, n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = s.nextLine();
        // reverse(str,0,str.length());
        System.out.println(reverse(str,str.length()-1));
        // System.out.println(n);
        s.close();
    }
}
