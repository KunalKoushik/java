import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter name: ");
         String name = sc.nextLine();
         int n = 5;
         float marks[] = new float[5];
         String dy[] = {"Hindi","English","Math","Physics","Chemistry"};
         for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject "+dy[i]+": ");
            marks[i] =  sc.nextFloat();
            while(marks[i] > 100) {
                System.out.println("Marks you have entered is not valid!");
                System.out.print(" enter again! for subject "+dy[i]+": ");
                marks[i] =  sc.nextFloat();
            }
        
        }
        float total = 0;
        for (float i : marks) {
            total+=i;
        } 
        float totalAvg = total/500;
        System.out.println("Total average is "+totalAvg);

        System.out.println("Percentage is "+(totalAvg*100) +"%");

        sc.close();
    }
}
