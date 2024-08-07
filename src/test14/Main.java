package test14;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];

        // 1. Заполнение массива случайными значениями от -20 до 20
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20; // Генерируем числа от -20 до 20
        }

        // Инициализация переменных для поиска максимального и минимального значений
        int max = array[0];
        int min = array[0];

        // Поиск максимального и минимального значений
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Вывод максимального и минимального значений
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);

        // Определение и вывод наибольшего по модулю значения
        int maxAbs = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю значение из максимального и минимального элементов: " + maxAbs);
    }
}
