import java.util.HashMap;

public class singleelement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 2 };
        // int arr1[] = new int[arr.length];
        // for (int i : arr) {
        // arr1[i]+=1;
        // }
        // for (int i = 0; i < arr1.length; i++) {
        // if (arr1[i]==1) {
        // System.out.println(i);
        // }
        // }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        // System.out.println(map);
        for (int i : arr) {
            if (map.get(arr[i]) == 1) {
                System.out.println(arr[i]);
            }
        }

    }
}
