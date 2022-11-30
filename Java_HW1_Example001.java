package Homework.JAVA_HW1;

import java.util.Scanner;
import java.io.IOException;//Очистка консоли

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
 * (произведение чисел от 1 до n)
 */

public class Java_HW1_Example001 {

    static String inString(String text) // Ввод данных в формате String
    {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in, "cp866");
        String data = scanner.nextLine();
        scanner.close();
        return data;
    }

    static int inInt(String text) // Ввод числа в формате Int
    {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in, "cp866");
        int data = scanner.nextInt();
        scanner.close();
        return data;
    }

    static int factorial(int n) // Нахождение факториала
    {
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor = i * factor;
        }
        return factor;
    }

    static long triangularNumber(int n)// Нахождение треугольного числа
     {
        long trianNumber = n * (n + 1) / 2;
        return trianNumber;
    }

    public static void main(String[] args) throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Очистка консоли
        
        int n = inInt("Введите значение n треугольного числа: ");

        long trianNumber = triangularNumber(factorial(n));
        System.out.println("Треугольное число = "+ trianNumber);

    }
}