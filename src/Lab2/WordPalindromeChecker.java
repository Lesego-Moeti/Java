package Lab2;

import java.util.Scanner;

public class WordPalindromeChecker {

        public static boolean isWordLevelPalindrome(String input) {
            // Remove spaces and convert to lowercase
            String cleanInput = input.replaceAll("\\s", "").toLowerCase();

            // Split the phrase into words
            String[] words = cleanInput.split(" ");

            int left = 0;
            int right = words.length - 1;

            while (left < right) {
                if (!words[left].equals(words[right])) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a phrase: ");
            String inputPhrase = scanner.nextLine();

            if (isWordLevelPalindrome(inputPhrase)) {
                System.out.println("The input phrase is a word-level palindrome.");
            } else {
                System.out.println("The input phrase is not a word-level palindrome.");
            }

            scanner.close();
        }
    }



