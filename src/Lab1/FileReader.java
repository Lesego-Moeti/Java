package Lab1;
import java.util.Scanner;
import java.io.File;

public class FileReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the filename");
        String filename = scanner.nextLine();

        File file = new File(filename);

        try {
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                System.out.println(line);


            }

            fileScanner.close();
        }
        catch (java.io.FileNotFoundException e){
            System.out.println("File not found");



        }
        scanner.close();

    }
}
