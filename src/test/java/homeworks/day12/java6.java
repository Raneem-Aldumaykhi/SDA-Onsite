package homeworks.day12;

import java.util.Scanner;

public class java6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();

        // Remove all non-alphanumeric characters
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        // Initialize pointers for the start and end of the string
        int start = 0;
        int end = str.length() - 1;

        // Loop until the pointers meet
        while (start < end) {
            // If characters at both pointers are not equal, return false
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            // Move the pointers towards the center
            start++;
            end--;
        }

        // If the loop completes, the string is a palindrome
        return true;
    }
}

