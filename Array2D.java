import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;                  
        int min= Integer.MAX_VALUE;
        int[][] arr=new int[3][3];
        int a1=0;
        int a2=0;
        int b1=0;
        int b2=0;
        System.out.println("Enter value of 2D Array: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix Before swap");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]>max){
                    max=arr[i][j];
                    a1=i;
                    a2=j;
                }
                if (arr[i][j]<min) {
                    min=arr[i][j];
                    b1=i;
                    b2=j;
                }
            }
            System.out.println();
        }
        int temp = arr[a1][a2];
        arr[a1][a2]=arr[b1][b2];
        arr[b1][b2]=temp;
        System.out.println("after swap");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
