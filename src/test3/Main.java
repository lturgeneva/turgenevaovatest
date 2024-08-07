package test3;
public class Main {
    public static void main(String[] args) {
        // 1. Задаём массив из 5 любых целых чисел
        int[] numbers = {1, 2, 3, 4, 5};

        // 2. Меняем местами первый и последний элемент в массиве
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        // 3. Выводим в консоль результат суммы первого и среднего элемента
        int sum = numbers[0] + numbers[numbers.length / 2];
        System.out.println("Сумма первого и среднего элемента: " + sum);
    }
}

