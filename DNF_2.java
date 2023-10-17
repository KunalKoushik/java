public class DNF_2 {
    public static void main(String[] args) {
        int arr[] ={0,1,0,1,1,0};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >=i; j--) { 
                if (arr[i] == 1 && arr[j] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" " );
        }
    }
}
