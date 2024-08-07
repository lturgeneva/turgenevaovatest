package test12;
public class Main {
    public static void main(String[] args) {
        // Исходная строка
        String str = "I like Java!!!";

        // 1. Проверка, содержит ли строка подстроку "Java"
        boolean containsJava = str.contains("Java");

        // 2. Проверка, начинается ли строка с подстроки "I like"
        boolean startsWithILike = str.startsWith("I like");

        // 3. Проверка, заканчивается ли строка на "!!!"
        boolean endsWithExclamation = str.endsWith("!!!");

        // 4. Если все условия верны, вывести строку в верхнем регистре
        if (containsJava && startsWithILike && endsWithExclamation) {
            System.out.println("Строка в верхнем регистре: " + str.toUpperCase());
        }

        // 5. Заменить все символы 'a' на 'o' и вывести подстроку "Jovo"
        String replacedStr = str.replace('a', 'o');
        String substring = replacedStr.substring(0, 4) + "o";
        System.out.println("Подстрока после замены и добавления 'o': " + substring);
    }
}
