package pureparc;

import java.util.Scanner;

public class SimpleMatrixSolver {

	
	
	 
    // Method to calculate determinant of 3x3 matrix
    public static double determinant(double[][] matrix) {
        return 
        		matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])          - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])      + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    
    // Method to replace a column with constants
    public static double[][] replaceColumn(double[][] matrix, double[] constants, int col) {
        double[][] newMatrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(matrix[i], 0, newMatrix[i], 0, 3);
            newMatrix[i][col] = constants[i];
        }
        return newMatrix;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple 3x3 Matrix Equation Solver");
        System.out.println("For equations of form:");
        System.out.println("ax + by + cz = d");
        System.out.println("ex + fy + gz = h");
        System.out.println("ix + jy + kz = l");
        
        // Create arrays to store coefficients and constants
        double[][] coefficients = new double[3][3];
        double[] constants = new double[3];
        
        // Get input for the equations
        String[] variables = {"a", "b", "c", "e", "f", "g", "i", "j", "k"};
        String[] constantsNames = {"d", "h", "l"};
        
        int varIndex = 0;
        for (int eq = 0; eq < 3; eq++) {
            System.out.println("\nEnter coefficients for equation " + (eq + 1) + ":");
            for (int co = 0; co < 3; co++) {
                System.out.print(variables[varIndex++] + ": ");
                coefficients[eq][co] = scanner.nextDouble();
            }
            System.out.print(constantsNames[eq] + ": ");
            constants[eq] = scanner.nextDouble();
        }
        
        // Solve using Cramer's Rule (simpler for beginners than Gaussian elimination)
        double det = determinant(coefficients);
        
        if (det == 0) {
            System.out.println("\nThe system has no unique solution (determinant is zero).");
        } else {
            // Create matrices for x, y, z determinants
            double[][] xMatrix = replaceColumn(coefficients, constants, 0);
            double[][] yMatrix = replaceColumn(coefficients, constants, 1);
            double[][] zMatrix = replaceColumn(coefficients, constants, 2);
            
            double x = determinant(xMatrix) / det;
            double y = determinant(yMatrix) / det;
            double z = determinant(zMatrix) / det;
            
            System.out.println("\nSolution:");
            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f\n", y);
            System.out.printf("z = %.2f\n", z);
        }
        
        scanner.close();
    }}
   