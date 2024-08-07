package testitog4;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String correctAnswer = "Пять";
            int maxAttempts = 5;
            boolean hintUsed = false;

            System.out.println("Загадка: Сколько углов станет у квадратного стола, если у него отпилить один угол.");
            System.out.println("У вас есть " + maxAttempts + " попытки, чтобы отгадать загадку.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Попытка " + attempt + ": ");
                String userInput = scanner.nextLine().trim();

                if (attempt == 1 && userInput.equalsIgnoreCase("Подсказка")) {
                    System.out.println("Подсказка: Это связано с компьютерными вирусами.");
                    hintUsed = true;
                    continue;
                }

                if (userInput.equalsIgnoreCase(correctAnswer)) {
                    System.out.println("Правильно!");
                    return;
                } else if (attempt < maxAttempts) {
                    System.out.println("Подумай еще!");
                }
            }

            // If the user has used a hint and still gets it wrong
            if (hintUsed) {
                System.out.println("Обидно, попробуй в другой раз");
            } else {
                System.out.println("Обидно, попробуй в другой раз");
            }

            scanner.close();
        }
    }
