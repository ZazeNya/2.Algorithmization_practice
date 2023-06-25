import java.util.Scanner;
import java.util.*;


/* Задача 6
     Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int a= in.nextInt();
        System.out.print("Введите второе число ");
        int b= in.nextInt();
        System.out.print("Введите третье число ");
        int c= in.nextInt();
        System.out.println("Являются ли данные три числа взаимно простыми?");
        System.out.println(Coprime(a, b, c));
    }
    private static boolean Coprime(int a, int b, int c) {

        int min = 0;
        int count = 0;

        if (a <= b && a <= c)
            min = a;
        else if (b <= a && b <= c)
            min = b;
        else if (c <= a && c <= b)
            min = c;
        for (int i = 2; i < min; i++)
            if (a % i == 0 && b % i == 0 && c % i == 0 )
                count++;
        return count == 0;
    }
}
