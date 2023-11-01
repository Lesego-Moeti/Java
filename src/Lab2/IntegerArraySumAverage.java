package Lab2;

import java.util.Scanner;

public class IntegerArraySumAverage {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] array = {21, 22, 23, 24, 25, 26};

            int min = array[0];
            int max = array[0];

            int sum = 0;
            double average = 0;


            for (int i : array) {
                sum += i;
                average = (double) sum / array.length;

            }

            for(int i = 1; i < array.length; i++){
                if(array[i] > max){
                    max =array[i];


                }
                if(array[i] < min ){
                    min = array[i];

                }
            }
            System.out.println("The sum of these elements is   " + sum);
            System.out.println("The average of this elements is  " + average);
            System.out.println("Maximum value:  " + max);
            System.out.println("Minimum value:  " +min);
        }




    }


