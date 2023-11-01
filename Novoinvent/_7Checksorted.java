public class _7Checksorted {
    static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if (arr[i+1]>=arr[i]) {
            return isSorted(arr, i+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,4,5,7,13,16};
        if (isSorted(arr,0)) {
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is Not Sorted");
        }
    }
}
