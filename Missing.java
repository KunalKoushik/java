public class Missing {
    public static void main(String[] args) {
        // int arr[] = {1,2,4,0,5};
        int arr[] = {3,2,4,6,7};
        int n=arr.length;
        int s1=0;
        int max=-1;
        int min =-1;
        for (int i = 0; i < arr.length; i++) {
            s1+=arr[i];
        }
        for (int i = 0; i < n; i++) {
            if(max<arr[i])
            max=arr[i];
        }
        for (int i = 0; i <n; i++) {
            if(min>arr[i])
            min=arr[i];
        }

        int sum = 0;
        for (int i = min; i <=max; i++) {
            sum+=i;
        }
        int num = sum-s1;
        System.out.println("Missing no is "+num);
    }
}
