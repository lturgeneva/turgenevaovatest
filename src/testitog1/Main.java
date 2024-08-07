package testitog1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод текущего курса доллара
            System.out.print("Введите текущий курс доллара: ");
            double exchangeRate = scanner.nextDouble();

            // Ввод количества рублей
            System.out.print("Введите количество рублей: ");
            double rubles = scanner.nextDouble();

            // Выполнение конвертации
            double dollars = rubles / exchangeRate;

            // Округление результата до двух знаков после запятой
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            String formattedDollars = decimalFormat.format(dollars);

            // Вывод результата
            System.out.println("Итого: " + formattedDollars + " долларов");

            scanner.close();
        }
    }

