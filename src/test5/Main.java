package test5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ввод двух чисел с клавиатуры
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        // 2. Ввод арифметического символа
        System.out.print("Введите арифметический символ (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // 3. Выполнение соответствующей арифметической операции
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Ошибка: Деление на ноль невозможно");
                }
                break;
            default:
                System.out.println("Ошибка: Неверный арифметический символ");
                break;
        }

        scanner.close();
    }
}

