import java.util.Scanner;

public class countvowel {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int vowelCount = countVowels(input);
        System.out.println("The number of vowels in the string is: " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive counting

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }
}
