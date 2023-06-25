import java.util.Scanner;
import static java.lang.Math.*;

/* Задача 16
    Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать
    декомпозицию.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n");
        int n =in.nextInt();
        if (NumberOdd(NewArray(n))) {
            System.out.print("Число " + n + " состоит из нечетных чисел, сумма цифр равна ");
            int sum = SumNumbersOdd(NewArray(n));
            System.out.println(sum);
            System.out.println("Количество четных чисел в сумме цифр числа " + n + " равна " + AmountNumbers(NewArray(sum)));
        } else {
            System.out.println("Число " + n + " содержит четные числа или ноль");
        }
    }

    public static int[] NewArray(int num) {//создаем массив из n-значного числа
        char[] charArr = Integer.toString(abs(num)).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++)
            array[i] = Character.getNumericValue(charArr[i]);
        return array;
    }

    public static boolean NumberOdd(int[] array) {//проверка числа на наличие нечетных чисел
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                count++;
            else break;
        }
        if (count == array.length)
            return true;
        else
            return false;
    }

    public static int SumNumbersOdd(int[] array) {// сумма чисел массива
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum = sum + array[i];
        return sum;
    }
    public static int AmountNumbers(int[] array) {//определяем количество четных чисел в числе
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                count++;
        return count;
    }
}
