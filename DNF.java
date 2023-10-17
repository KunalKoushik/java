// import java.io.*;
public class DNF {
	static void sort012(int a[], int arr_size)
	{
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
				// If the element is 0
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
				// If the element is 1
			case 1:
				mid++;
				break;
				// If the element is 2
			case 2: {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
			}
		}
	}

	/*Driver function to check for above functions*/
	public static void main(String[] args)
	{
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int arr_size = arr.length;
		sort012(arr, arr_size);//function calling
        for (int i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}

