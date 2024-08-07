package test8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа от пользователя
        System.out.print("Введите положительное целое число n: ");
        int n = scanner.nextInt();

        // Проверка на положительное значение
        if (n <= 0) {
            System.out.println("Ошибка: Введите положительное целое число.");
            return;
        }

        // Инициализация переменной для хранения суммы
        int sum = 0;

        // Суммирование нечетных чисел от 1 до n
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        // Вывод результата
        System.out.println("Сумма всех нечетных чисел от 1 до " + n + " равна: " + sum);

        scanner.close();
    }
}
