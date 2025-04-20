package pureparc;

public class Matrix {

    public static void main(String[] args) {
        // Example: Solve the system:
        // 2x + y - z = 8
        // -3x - y + 2z = -11
        // -2x + y + 2z = -3
        
        double[][] coefficients = {
            {2, 1, -1},
            {-3, -1, 2},
            {-2, 1, 2}
        };
        
        double[] constants = {8, -11, -3};
        
        try {
            double[] solution = solve(coefficients, constants);
            System.out.println("Solution:");
            for (int i = 0; i < solution.length; i++) {
                System.out.printf("x%d = %.2f\n", i+1, solution[i]);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double[] solve(double[][] coefficients, double[] constants) {
        int n = constants.length;
        
        // Check if matrix is square
        if (coefficients.length != n) {
            throw new IllegalArgumentException("Coefficient matrix must be square");
        }
        for (double[] row : coefficients) {
            if (row.length != n) {
                throw new IllegalArgumentException("Coefficient matrix must be square");
            }
        }
        
        // Create augmented matrix
        double[][] augmentedMatrix = new double[n][n + 1];
        for (int i = 0; i < n; i++) {
            System.arraycopy(coefficients[i], 0, augmentedMatrix[i], 0, n);
            augmentedMatrix[i][n] = constants[i];
        }
        
        // Perform Gaussian elimination
        for (int col = 0; col < n; col++) {
            // Partial pivoting
            int maxRow = col;
            for (int row = col + 1; row < n; row++) {
                if (Math.abs(augmentedMatrix[row][col]) > Math.abs(augmentedMatrix[maxRow][col])) {
                    maxRow = row;
                }
            }
            
            // Swap rows
            double[] temp = augmentedMatrix[col];
            augmentedMatrix[col] = augmentedMatrix[maxRow];
            augmentedMatrix[maxRow] = temp;
            
            // Check for singular matrix
            if (Math.abs(augmentedMatrix[col][col]) < 1e-10) {
                throw new IllegalArgumentException("Matrix is singular or nearly singular");
            }
            
            // Eliminate current column in all rows below
            for (int row = col + 1; row < n; row++) {
                double factor = augmentedMatrix[row][col] / augmentedMatrix[col][col];
                for (int c = col; c <= n; c++) {
                    augmentedMatrix[row][c] -= factor * augmentedMatrix[col][c];
                }
            }
        }
        
        // Back substitution
        double[] solution = new double[n];
        for (int row = n - 1; row >= 0; row--) {
            double sum = 0.0;
            for (int col = row + 1; col < n; col++) {
                sum += augmentedMatrix[row][col] * solution[col];
            }
            solution[row] = (augmentedMatrix[row][n] - sum) / augmentedMatrix[row][row];
        }
        
        return solution;
    }
}