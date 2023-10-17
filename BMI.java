import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("enter your Height in Meters: ");
        float H = s.nextFloat();
        System.out.print("enter your Weight in KG: ");
        float W = s.nextFloat();
     
        double bmi = W/(H*H);
        System.out.println("Your BMI is : "+bmi);
        s.close();
    }
}
