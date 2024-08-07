package testitog3;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод количества строк
            System.out.print("Количество строк: ");
            int n = scanner.nextInt();
            scanner.nextLine();  // Чтение оставшегося символа новой строки

            // Инициализация переменных для хранения строки с максимальным количеством уникальных символов
            String resultString = null;
            int maxUniqueCount = -1;

            // Ввод и обработка строк
            for (int i = 1; i <= n; i++) {
                System.out.print("Строка " + i + ": ");
                String inputString = scanner.nextLine();

                // Найти количество уникальных символов в строке
                int uniqueCharCount = getUniqueCharacterCount(inputString);

                // Обновить строку с максимальным количеством уникальных символов
                if (uniqueCharCount > maxUniqueCount) {
                    maxUniqueCount = uniqueCharCount;
                    resultString = inputString;
                }
            }

            // Вывод результата
            System.out.println("Ответ: " + resultString);

            scanner.close();
        }

        // Метод для подсчета количества уникальных символов в строке
        private static int getUniqueCharacterCount(String str) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : str.toCharArray()) {
                uniqueChars.add(c);
            }
            return uniqueChars.size();
        }
    }

