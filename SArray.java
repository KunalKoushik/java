public class SArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int[] newarr=new int[arr.length];
        newarr[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            newarr[i] = arr[i]+newarr[i-1];
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
    }
}
