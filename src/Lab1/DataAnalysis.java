package Lab1;

import java.io.*;
import java.util.Scanner;

public class DataAnalysis {
    public static void main(String[] args) {
        try {
            // Read data from input file
            Scanner inputScanner = new Scanner(new File("values.txt"));
            int smallestNumber = Integer.MAX_VALUE;
            int largestNumber = Integer.MIN_VALUE;
            double sum = 0;
            int count = 0;

            while (inputScanner.hasNextInt()) {
                int number = inputScanner.nextInt();
                smallestNumber = Math.min(smallestNumber, number);
                largestNumber = Math.max(largestNumber, number);
                sum += number;
                count++;
            }

            inputScanner.close();

            double average = sum / count;

            // Write results to output file
            FileWriter outputWriter = new FileWriter("solutions.txt");
            outputWriter.write("Smallest number: " + smallestNumber + "\n");
            outputWriter.write("Largest number: " + largestNumber + "\n");
            outputWriter.write("Average: " + average + "\n");
            outputWriter.write("Full name: Lesego Moeti\n");
            outputWriter.write("Student ID: 21000641\n");
            outputWriter.close();

            System.out.println("Data analysis completed and results written to output file.");
        } catch (IOException e) {
            System.out.println("An error occurred while performing data analysis or writing the results.");
            e.printStackTrace();
        }
    }
}


