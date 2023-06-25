import java.util.Scanner;
import java.util.*;


/* Задача 7
     Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n=9;
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9");
        System.out.println(Factorials(n));

    }
    private static int Factorials(int n) {

        int result = 0;

        for (int i = 1; i <= n; i++) {
            int factorial = 1;
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++)
                    factorial *= j ;
                result += factorial;
            }
        }
        return result;
    }
}
