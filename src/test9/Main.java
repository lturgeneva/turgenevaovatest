package test9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создание массива и ввод элементов
        double[] array = new double[size];
        System.out.println("Введите элементы массива (числа с плавающей точкой):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // 2. Вычисление среднего арифметического элементов массива
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / size;
        System.out.println("Среднее арифметическое: " + average);

        // 3. Вывод массива, где каждый элемент умножен на среднее арифметическое
        System.out.println("Массив после умножения каждого элемента на среднее арифметическое:");
        for (double num : array) {
            double result = num * average;
            System.out.printf("%.2f ", result);
        }

        scanner.close();
    }
}
