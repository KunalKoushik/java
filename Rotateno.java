import java.util.Scanner;

public class Rotateno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ENter the number to rotate: ");
        int num = s.nextInt();
        int temp = num;
        System.out.print("ENter the number of rotate: ");
        int r = s.nextInt();
        int len=0;
        while(temp>0){
            temp/=10;
            len++;
        }
        r = r%len;
        int div =1;
        while(len>1){
            div *= 10;
            len--;
        }
        while(r>0){
            temp = num%10;
            num = num/10;
            num = temp*div+num;
            r--;
        }
        System.out.println("After Rotation: "+num);
        s.close();
    }
}
