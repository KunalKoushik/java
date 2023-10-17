
public class Arraydemo {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1} ;
        // int dv[] = new int[6];

        // for (int i = 0; i < dv.length; i++) {
        //     System.out.println("Enter the value : ");
        //     dv[i]=sc.nextInt();
        // }
        // for (int i = 0; i < dv.length; i++) {
        //     System.out.print(dv[i]+" ");
        // }
        // int min=arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     if(min>arr[i])
        //        min=arr[i];
        // }
        // System.out.println("Minimum element is "+min);

        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (max2<arr[i] && arr[i]!= max) {
                max2=arr[i];
            }
        }

        System.out.println("second Max element is "+max2);
       
    }    
}
