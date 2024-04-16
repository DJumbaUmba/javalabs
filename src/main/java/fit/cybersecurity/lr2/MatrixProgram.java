package fit.cybersecurity.lr2;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class MatrixProgram {
    private static final int MAX_SIZE = 20;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ширину матриці:");
        int width = scanner.nextInt();
        System.out.println("Введіть висоту матриці:");
        int height = scanner.nextInt();

        if (width > MAX_SIZE || height > MAX_SIZE) {
            System.out.println("Розмір матриці не може бути більше " + MAX_SIZE);
            return;
        }

        int[][] matrix = new int[height][width];
        System.out.println("Виберіть спосіб заповнення матриці: 1 - вручну, 2 - рандомно");
        int choice = scanner.nextInt();

        if (choice == 1) {
            fillMatrixManually(matrix, scanner);
        } else if (choice == 2) {
            fillMatrixRandomly(matrix);
        } else {
            System.out.println("Невірний вибір");
            return;
        }

        int min = findMin(matrix);
        int max = findMax(matrix);
        double arithmethicAverage = calculateArithmethicAverage(matrix);
        double geometricAverage = calculateGeometricAverage(matrix);

        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Середнє значення: " + arithmethicAverage);
        System.out.println("Середнє геометричне: " + geometricAverage);
    }

    private static void fillMatrixManually(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Введіть елемент [" + i + "][" + j + "]:");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void fillMatrixRandomly(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            }
        }
    }

    private static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    private static double calculateArithmethicAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }

    private static double calculateGeometricAverage(int[][] matrix) {
        double product = 1.0;
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                product *= value;
                count++;
            }
        }
        return Math.pow(product, 1.0 / count);
    }
}
