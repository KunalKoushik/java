import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Temp in celcious: ");
        double celcious = s.nextFloat();
        double farhenhiet = (celcious*9)/5 +32 ;
        
        System.out.println("Temperature in Farhenhiet is: "+farhenhiet+"f");
        System.out.print("Enter Temp in Farhenhiet: ");
        farhenhiet = s.nextFloat();
        
        celcious = ((farhenhiet-32)*5)/9 ;
        
        System.out.println("Temperature in calcious is: "+celcious);
        s.close();
    }
}
