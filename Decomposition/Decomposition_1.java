import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Collections;


/* Задача 1
    Написать метод(методы) для нахождения наибольшего общего делителя
    и наименьшего общего кратного двух натуральных чисел:
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число ");
        if(sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.print("Введите второе число ");
            if(sc.hasNextInt()) {
                b = sc.nextInt();

                System.out.println("NOD = " + NOD(a,b)); //НОД - наибольший общий делитель
                System.out.println("NOК = " + NOK(a,b)); //НОK - наименьшее общее кратное
            }
        }
        else {
            System.out.println("Ошибка при вводе числа");
        }
    }
    private static int NOD(int a, int b) {
        int result = 0;

        if (a <= b) {
            for (int i = a; i > 0; i--) {
                if (a % i == 0 && b % i == 0){
                    result = i;
                    break;
                }
            }

        } else if (b <= a) {
            for (int i = b; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    private static int NOK(int a, int b) {
        int result = 1;

        while (true) {
            result++;
            if (result % a == 0 && result % b == 0)
                break;
        }

        return result;
    }
}
