package test11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Ввод первого числа (в строковом формате)
            System.out.print("Введите первое число: ");
            String firstNumberStr = scanner.nextLine();

            // 2. Ввод второго числа (в целочисленном формате)
            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            // Преобразование первого числа в целочисленный тип
            int firstNumber;
            try {
                firstNumber = Integer.parseInt(firstNumberStr);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Первое число не является целым числом.");
                return;
            }

            // 3. Сравнение чисел и вывод большего
            if (firstNumber > secondNumber) {
                System.out.println("Большее число: " + firstNumber);
                System.out.println("Меньшее число (в формате double): " + (double) secondNumber);
            } else {
                System.out.println("Большее число: " + secondNumber);
                System.out.println("Меньшее число (в формате double): " + (double) firstNumber);
            }

            scanner.close();
        }
    }

