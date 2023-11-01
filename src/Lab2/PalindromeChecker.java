package Lab2;

import java.util.Scanner;

public class PalindromeChecker {


        public static boolean isPalindrome(String input) {
            // Remove spaces and convert to lowercase
            String cleanInput = input.replaceAll("\\s", "").toLowerCase();

            int length = cleanInput.length();
            for (int i = 0; i < length / 2; i++) {
                if (cleanInput.charAt(i) != cleanInput.charAt(length - 1 - i)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            if (isPalindrome(inputString)) {
                System.out.println("The input string is a palindrome.");
            } else {
                System.out.println("The input string is not a palindrome.");
            }

            scanner.close();
        }
}
