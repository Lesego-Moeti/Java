package Lab1;
import java.util.Scanner;


public class MatrixOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Reading the dimensions of the matrices
        System.out.print("Enter the number of rows for the matrices A and B: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns for matrices A and B:");
            int columns = scanner.nextInt();

            //Create the matrices with the given dimensions
        int[][] matrixA = new int[rows][columns];
            int[][]matrixB = new int[rows][columns];

            //Read the elements of Matrix A
        System.out.println("Enter the elements of matrix A:");
            for(int i = 0; i < rows; i++){
                for(int j= 0; j<columns; j++){
                    matrixA[i][j]= scanner.nextInt();

                }
            }

            //Read the elements of matrix B

        System.out.println("Enter the elements of matrix B");
            for(int i = 0; i< rows; i++){
                for(int j = 0; j<columns; j++){
                    matrixB[i][j]= scanner.nextInt();

                }
            }

            //perform the matrix operation(addition or multiplication)
        int[][] resultMatrix= new int[rows][columns];

            System.out.println("Enter the matrix operation (addition/multiplication:");
                String operation = scanner.next();

                if(operation.equals("addition")||operation.equals("multiplication")){
                    for (int i = 0; i< rows; i++){
                        for(int j= 0; j< columns; j++){
                            if( operation.equals("addition")){
                        resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];

                            } else{
                        resultMatrix[i][j]= matrixA[i][j] * matrixB[i][j];
                            }
                        }
                    }
                    //Display the result matrix

                    System.out.println("Result matrix: ");
                    for(int i = 0; i<rows; i++){
                        for(int j = 0; j< columns; j++){
                            System.out.print(resultMatrix[i][j] + "");
                        }
                        System.out.println();

                    }
                    scanner.close();

                }


    }
}

