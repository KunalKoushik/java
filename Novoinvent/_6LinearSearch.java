public class _6LinearSearch {
    static int search(int[] arr,int target,int i){
            if (arr[i] == target) {
                return i;
            }
            if (i>=arr.length) {
                return -1;
            }
            return (search(arr, target, i+1));
        
        
    }
    public static void main(String[] args) {
        int[] arr = {6,5,7,9};
        int target = 7;
        System.out.println("Found at index "+search(arr,target,0));
    }
}

