import java.util.Scanner;

import static java.lang.Math.*;

/* Задача 14
    Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
    возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения
    задачи использовать декомпозицию.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите k>1");
        int k = in.nextInt();
        System.out.println("Все числа Армстронга от 1 до " + k);
        for (int i = 1; i < k; i++)
            if (ArmstrongNumbers(NewArray(i)) == i)
                System.out.print(i + ", ");
    }
    //создаем массив из числа
    public static int[] NewArray(int num) {
        char[] charArr = Integer.toString(num).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }

    public static int ArmstrongNumbers(int[] array) { //найдем числа Армстронга
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + (int) pow(array[i], array.length);
        }
        return sum;
    }
}
