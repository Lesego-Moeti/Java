package Lab2;

import java.util.Scanner;

public class StringManipulation {


        private String initialString;

        public StringManipulation(String initialString) {
            this.initialString = initialString;
        }

        public void addCharacters(String charactersToAdd) {
            initialString += charactersToAdd;
        }

        public void concatenate(String additionalString) {
            initialString += additionalString;
        }

        public void insertSubstring(int index, String substring) {
            if (index >= 0 && index <= initialString.length()) {
                initialString = initialString.substring(0, index) + substring + initialString.substring(index);
            } else {
                System.out.println("Invalid index for substring insertion.");
            }
        }

        public void replaceCharacter(char oldChar, char newChar) {
            initialString = initialString.replace(oldChar, newChar);
        }

        public String getInitialString() {
            return initialString;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the initial string: ");
            String initialString = scanner.nextLine();

            StringManipulation stringManipulator = new StringManipulation(initialString);

            int choice;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Add characters to the string");
                System.out.println("2. Concatenate a string");
                System.out.println("3. Insert a substring");
                System.out.println("4. Replace a character");
                System.out.println("5. Display the modified string");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter characters to add: ");
                        String charactersToAdd = scanner.nextLine();
                        stringManipulator.addCharacters(charactersToAdd);
                        break;
                    case 2:
                        System.out.print("Enter the string to concatenate: ");
                        String additionalString = scanner.nextLine();
                        stringManipulator.concatenate(additionalString);
                        break;
                    case 3:
                        System.out.print("Enter the index for substring insertion: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter the substring to insert: ");
                        String substring = scanner.nextLine();
                        stringManipulator.insertSubstring(index, substring);
                        break;
                    case 4:
                        System.out.print("Enter the character to replace: ");
                        char oldChar = scanner.nextLine().charAt(0);
                        System.out.print("Enter the replacement character: ");
                        char newChar = scanner.nextLine().charAt(0);
                        stringManipulator.replaceCharacter(oldChar, newChar);
                        break;
                    case 5:
                        System.out.println("Modified string: " + stringManipulator.getInitialString());
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }

            } while (choice != 6);

            scanner.close();
        }
    }










