package GussianElimination;
import java.util.Scanner;

public class GaussianElimination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of equations: ");
        int n = scanner.nextInt();

        double[][] results = new double[n][n + 1];

        System.out.println("Enter the coefficients and constants for each equation:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]: ");
                results[i][j] = scanner.nextDouble();
            }
        }

        double[] solution = solve(results);

        System.out.println("Solution:");
        for (int i = 0; i < solution.length; i++) {
            System.out.println("x" + i + " = " + solution[i]);
        }

        scanner.close();
    }

    public static double[] solve(double[][] results) {
        int n = results.length;

        // Perform Gaussian elimination using elementary row operations
        for (int i = 0; i < n; i++) {


            // Find the pivot row
            int maxRow = i;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(results[j][i]) > Math.abs(results[maxRow][i])) {
                    maxRow = j;
                }
            }

            // Swap the current row with the pivot row
            double[] temp = results[i];
            results[i] = results[maxRow];
            results[maxRow] = temp;

            // Make the diagonal element 1
            double pivot = results[i][i];
            for (int j = i; j < n + 1; j++) {
                results[i][j] /= pivot;
            }

            // Eliminate other rows
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    double factor = results[j][i];
                    for (int k = i; k < n + 1; k++) {
                        results[j][k] -= factor * results[i][k];
                    }
                }
            }
        }

        // Extract the solution
        double[] solution = new double[n];
        for (int i = 0; i < n; i++) {
            solution[i] = results[i][n];
        }

        return solution;
    }
}
