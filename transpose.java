import java.util.*;
public class transpose {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i<j) {
                    temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }


        System.out.println("transpose");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    
}
// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int[][] answer = new int[matrix[0].length][matrix.length];
//         for(int i=0; i < matrix.length; i++){
//             for (int j = 0; j < matrix[0].length; j++){
//                 answer[j][i] = matrix[i][j];
//             } 
//         }
//         return answer;
//     }
// }