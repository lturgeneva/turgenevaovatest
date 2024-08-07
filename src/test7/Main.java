package test7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // Создание массива и ввод элементов
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Заданные константы
        final int x = 5;
        final int y = 10;
        final int z = 15;

        // Проверка наличия хотя бы одной из констант в массиве
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
                found = true;
                break;
            }
        }

        // Вывод результата
        if (found) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Данное значение отсутствует в константах");
        }

        scanner.close();
    }
}
