import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MatrixMultiplication {

    private static final int MATRIX_SIZE = 3; 
    private static final int NUM_THREADS = 3; 

    private static int[][] resultMatrix = new int[MATRIX_SIZE][MATRIX_SIZE];
    private static int[][] matrixA = new int[MATRIX_SIZE][MATRIX_SIZE];
    private static int[][] matrixB = new int[MATRIX_SIZE][MATRIX_SIZE];

    public static void main(String[] args) {
        initializeMatrix(matrixA);
        initializeMatrix(matrixB);

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        for (int i = 0; i < MATRIX_SIZE; i++) {
            executor.execute(new MatrixMultiplier(i));
        }

        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nResult Matrix:");
        printMatrix(resultMatrix);
    }

    private static void initializeMatrix(int[][] matrix) {
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < MATRIX_SIZE; i++) {
            for (int j = 0; j < MATRIX_SIZE; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static class MatrixMultiplier implements Runnable {
        private final int row;

        public MatrixMultiplier(int row) {
            this.row = row;
        }

        @Override
        public void run() {
            for (int col = 0; col < MATRIX_SIZE; col++) {
                for (int k = 0; k < MATRIX_SIZE; k++) {
                    resultMatrix[row][col] += matrixA[row][k] * matrixB[k][col];
                }
            }
        }
    }
}
