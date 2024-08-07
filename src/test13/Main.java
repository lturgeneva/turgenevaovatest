package test13;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки
        System.out.print("Введите строку из слов, разделенных пробелами: ");
        String input = scanner.nextLine();

        // Разделение строки на слова
        String[] words = input.split("\\s+");

        // Регулярное выражение для проверки латинских букв
        Pattern latinPattern = Pattern.compile("^[a-zA-Z]+$");

        // Переменная для подсчета количества латинских слов
        int count = 0;

        System.out.println("Слова, состоящие только из латиницы:");

        // Проверка каждого слова
        for (String word : words) {
            if (latinPattern.matcher(word).matches()) {
                System.out.println(word);
                count++;
            }
        }

        // Вывод количества латинских слов
        System.out.println("Количество слов, состоящих только из латиницы: " + count);

        scanner.close();
    }
}
