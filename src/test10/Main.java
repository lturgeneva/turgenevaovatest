package test10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности матрицы
        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        // Создание матрицы и ввод элементов
        double[][] matrix = new double[rows][cols];
        System.out.println("Введите элементы матрицы (числа с плавающей точкой):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Элемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Вывод первой строки матрицы с умножением на 3
        System.out.println("Первая строка матрицы, где каждый элемент умножен на 3:");
        if (rows > 0) {
            for (int j = 0; j < cols; j++) {
                double result = matrix[0][j] * 3;
                System.out.printf("%.2f ", result);
            }
        } else {
            System.out.println("Матрица пуста (нет строк).");
        }

        scanner.close();
    }
}
