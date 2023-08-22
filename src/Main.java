// В это программе я написал два метода проверки строки на полиндром
// Первый метод исользвует два массива символов для сравнения элементов
// Второй метод использует один массив и сравнивает значения слева и справа от середины

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Вводим текст для проверки
        Scanner scanner = new Scanner(System.in);
        String textForCheck = scanner.nextLine();

        // Вызываем метод
        palindrome(textForCheck);

        // Вызов второго метода
        palindromeSecond(textForCheck);
    }

    public static void palindrome(String text) {

        // Создаем два массива символов для сравнения
        char[] palindromeCheck = text.toCharArray();
        char[] reverse = new char[palindromeCheck.length];

        // Записываем слово наоборот во второй массив
        for (int i = palindromeCheck.length - 1; i >= 0; i--) {
            reverse[palindromeCheck.length - 1 - i] = palindromeCheck[i];
        }

        // Вывод результата
        if (Arrays.toString(reverse).equals(Arrays.toString(palindromeCheck))) {
            System.out.println("Стркоа палиндром");
        } else {
            System.out.println("Стркоа не палиндром");
        }
    }

    public static void palindromeSecond(String text) {

        // Создаем один массив символов
        char[] palindromeCheck = text.toCharArray();
        int length = palindromeCheck.length;

        // Сравниваем передние и задние символы
        for (int i = 0; i < (length / 2) + 1; i++) {
            if (!(palindromeCheck[i] == palindromeCheck[length - 1 - i])) {

                // Вывод результата
                System.out.println("Строка не палиндром");
                return;
            }
        }

        // Вывод результата
        System.out.println("Строка палиндром");
    }
}
