package Lab1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the filename");
        String fileInput = scanner.nextLine();

        System.out.println("Enter your input:");
        String userInput = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(fileInput);
            writer.write(userInput);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}


