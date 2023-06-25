import java.util.Scanner;
import static java.lang.Math.*;

/* Задача 17
    Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
    Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n");
        int n =in.nextInt();
        System.out.println(NumberOfOperations(n));

    }
    private static int NumberOfOperations(int num) {
        int result = 0;
        while (num > 0) {
            int n = num, lastDigit = 0, sum = 0;
            while (n > 0) {
                lastDigit = n % 10;
                n /=10;
                sum += lastDigit ;
            }
            num -= sum;
            result++;
        }
        return result;
    }
}
