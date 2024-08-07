package test4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Вводим три числа с клавиатуры
        System.out.print("Введите первое число (x): ");
        int x = scanner.nextInt();

        System.out.print("Введите второе число (y): ");
        int y = scanner.nextInt();

        System.out.print("Введите третье число (z): ");
        int z = scanner.nextInt();

        // 2. Находим и выводим среднее арифметическое этих чисел
        double average = (x + y + z) / 3.0;
        System.out.println("Среднее арифметическое: " + average);

        // 3. Делим среднее арифметическое на 2 и округляем в меньшую сторону
        int result = (int) Math.floor(average / 2);
        System.out.println("Результат деления среднего арифметического на 2 и округления в меньшую сторону: " + result);

        // 4. Проверяем, если полученное число больше 3
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}

