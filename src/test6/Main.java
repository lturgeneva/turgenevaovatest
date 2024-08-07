package test6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Масса
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - грамм, 3 - фунт, 4 - унция");
            int unit = scanner.nextInt();
            System.out.println("Введите количество выбранных единиц:");
            double amount = scanner.nextDouble();
            convertMass(unit, amount);
        } else if (choice == 2) {
            // Расстояние
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int unit = scanner.nextInt();
            System.out.println("Введите количество выбранных единиц:");
            double amount = scanner.nextDouble();
            convertDistance(unit, amount);
        } else {
            System.out.println("Неверный выбор");
        }

        scanner.close();
    }

    public static void convertMass(int unit, double amount) {
        switch (unit) {
            case 1:
                System.out.println("Килограммы: " + amount);
                System.out.println("Граммы: " + amount * 1000);
                System.out.println("Фунты: " + amount * 2.20462);
                System.out.println("Унции: " + amount * 35.274);
                break;
            case 2:
                System.out.println("Граммы: " + amount);
                System.out.println("Килограммы: " + amount / 1000);
                System.out.println("Фунты: " + amount * 0.00220462);
                System.out.println("Унции: " + amount * 0.035274);
                break;
            case 3:
                System.out.println("Фунты: " + amount);
                System.out.println("Килограммы: " + amount * 0.453592);
                System.out.println("Граммы: " + amount * 453.592);
                System.out.println("Унции: " + amount * 16);
                break;
            case 4:
                System.out.println("Унции: " + amount);
                System.out.println("Килограммы: " + amount * 0.0283495);
                System.out.println("Граммы: " + amount * 28.3495);
                System.out.println("Фунты: " + amount * 0.0625);
                break;
            default:
                System.out.println("Неверная единица измерения");
                break;
        }
    }

    public static void convertDistance(int unit, double amount) {
        switch (unit) {
            case 1:
                System.out.println("Метры: " + amount);
                System.out.println("Мили: " + amount * 0.000621371);
                System.out.println("Ярды: " + amount * 1.09361);
                System.out.println("Футы: " + amount * 3.28084);
                break;
            case 2:
                System.out.println("Мили: " + amount);
                System.out.println("Метры: " + amount * 1609.34);
                System.out.println("Ярды: " + amount * 1760);
                System.out.println("Футы: " + amount * 5280);
                break;
            case 3:
                System.out.println("Ярды: " + amount);
                System.out.println("Метры: " + amount * 0.9144);
                System.out.println("Мили: " + amount * 0.000568182);
                System.out.println("Футы: " + amount * 3);
                break;
            case 4:
                System.out.println("Футы: " + amount);
                System.out.println("Метры: " + amount * 0.3048);
                System.out.println("Мили: " + amount * 0.000189394);
                System.out.println("Ярды: " + amount * 0.333333);
                break;
            default:
                System.out.println("Неверная единица измерения");
                break;
        }
    }
}
