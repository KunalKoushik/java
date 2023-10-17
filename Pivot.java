public class Pivot {
    public static void main(String[] args) {
        // int arr[]={3,4,5,6,1};
        int nums[]={-1,-1,0,0,-1,-1};
        // int arr[] = {1,2,3,4,6,10};
        int n =nums.length;
        int sum=0;
        int s=0;
        for (int i = 1; i <n; i++) {
            sum+=nums[i];
        }
        for (int i = 0; i <n-1; i++) {
            s+=nums[i];
            sum-=nums[i+1];
            if (sum == s) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
