package testitog2;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки уравнения
        System.out.print("Введите уравнение длиной 5 символов: ");
        String equation = scanner.nextLine();

        // Проверка на корректность ввода
        if (equation.length() != 5 ||
                (equation.charAt(1) != '+' && equation.charAt(1) != '-') ||
                equation.charAt(3) != '=') {
            System.out.println("Неверный формат уравнения.");
            return;
        }

        // Извлечение значений
        char firstChar = equation.charAt(0);
        char operator = equation.charAt(1);
        char thirdChar = equation.charAt(2);
        char fifthChar = equation.charAt(4);

        int result;
        int firstValue, thirdValue, fifthValue;

        // Определение, где находится x и вычисление результата
        if (firstChar == 'x') {
            firstValue = 0;
            thirdValue = Character.getNumericValue(thirdChar);
            fifthValue = Character.getNumericValue(fifthChar);
            if (operator == '+') {
                result = fifthValue - thirdValue;
            } else {
                result = fifthValue + thirdValue;
            }
        } else if (thirdChar == 'x') {
            firstValue = Character.getNumericValue(firstChar);
            thirdValue = 0;
            fifthValue = Character.getNumericValue(fifthChar);
            if (operator == '+') {
                result = fifthValue - firstValue;
            } else {
                result = firstValue - fifthValue;
            }
        } else {
            firstValue = Character.getNumericValue(firstChar);
            thirdValue = Character.getNumericValue(thirdChar);
            fifthValue = 0;
            if (operator == '+') {
                result = firstValue + thirdValue;
            } else {
                result = firstValue - thirdValue;
            }
        }

        System.out.println("Значение x: " + result);

        scanner.close();
    }
}
