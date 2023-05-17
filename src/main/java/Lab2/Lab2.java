package Lab2;

import java.util.Random;
import java.util.Scanner;

public class Lab2 {
    private static final int MAX_SIZE = 20;

    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        printMatrix(matrix);

        int minValue = findMinValue(matrix);
        int maxValue = findMaxValue(matrix);
        double average = calculateAverage(matrix);

        System.out.println("Min Value: " + minValue);
        System.out.println("Max Value: " + maxValue);
        System.out.println("Average: " + average);
    }

    private static int[][] createMatrix() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the matrix: ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the matrix: ");
        int height = scanner.nextInt();

        // Limit the size of the matrix
        width = Math.min(width, MAX_SIZE);
        height = Math.min(height, MAX_SIZE);

        int[][] matrix = new int[height][width];
        Random random = new Random();

        System.out.println("Enter matrix elements manually (0) or generate randomly (1)?");
        int choice = scanner.nextInt();

        if (choice == 0) {
            System.out.println("Enter matrix elements:");

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
        } else {
            System.out.println("Generating random matrix...");

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = random.nextInt(100); // Change the range as needed
                }
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int findMinValue(int[][] matrix) {
        int min = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }

        return min;
    }

    private static int findMaxValue(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] row : matrix) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }

        return (double) sum / count;
    }
}