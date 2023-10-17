import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = s.nextLine();
        System.out.print("Enter the second string to check anagram : ");
        String str2 = s.nextLine();
        //convert first string into lower case
		str1=str1.toLowerCase();
		
		//convert second string into lower case
		str2=str2.toLowerCase();
	
		//convert first string into char array
		char[] first_array=str1.toCharArray();
		
		//convert second string into char array
		char[] second_array=str2.toCharArray();
		
		//sort first array
		Arrays.sort(first_array);
		
		//sort second array
		Arrays.sort(second_array);
		
        if (first_array.length != second_array.length) {
            System.out.println("Not an  Anagram ");
        }
        else{
            int i=0;
            for(;i<first_array.length;i++) {
                if(first_array[i]!=second_array[i]) {
                    System.out.println("Not an Anagram ");
                    break;
                }
            }
            if (i  >= first_array.length) {
                
                System.out.println(" an Anagram");
            }
        }

        s.close();
    }
}
