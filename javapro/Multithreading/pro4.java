import java.util.Scanner;

class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrices dimensions
        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible with the given dimensions.");
            return;
        }
        System.out.println("Enter elements for the first matrix:");
        int[][] matrixA = readMatrix(rowsA, colsA, scanner);

        System.out.println("Enter elements for the second matrix:");
        int[][] matrixB = readMatrix(rowsB, colsB, scanner);
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
        System.out.println("\nResult Matrix (Multiplication of Matrix A and Matrix B):");
        displayMatrix(resultMatrix);
        scanner.close();
    }
    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];
        MatrixMultiplicationThread[] threads = new MatrixMultiplicationThread[rowsA];

        for (int i = 0; i < rowsA; i++) {
            threads[i] = new MatrixMultiplicationThread(i, matrixA, matrixB, resultMatrix);
            threads[i].start();
        }
        try {
            for (MatrixMultiplicationThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return resultMatrix;
    }
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
class MatrixMultiplicationThread extends Thread {
    private int row;
    private int[][] matrixA;
    private int[][] matrixB;
    private int[][] resultMatrix;

    public MatrixMultiplicationThread(int row, int[][] matrixA, int[][] matrixB, int[][] resultMatrix) {
        this.row = row;
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.resultMatrix = resultMatrix;
    }

    @Override
    public void run() {
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        for (int j = 0; j < colsB; j++) {
            for (int k = 0; k < colsA; k++) {
                resultMatrix[row][j] += matrixA[row][k] * matrixB[k][j];
            }
        }
    }
}