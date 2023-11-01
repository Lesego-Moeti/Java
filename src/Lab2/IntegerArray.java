package Lab2;

import java.util.Scanner;

public class IntegerArray {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the size of the array");
            int size = scan.nextInt();
            int[] array = new int[size];
            int sum = 0;

            for(int i= 0; i < size; i++){
                System.out.println("Enter the element");
                array[i] = scan.nextInt();


            }
            scan.close();
            for(int i = 0; i < array.length; i++){
                sum = i + array[i];

            }
            System.out.println("The sum of these elements is  " + sum);

        }
    }


