import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Collections;


/* Задача 2
    Написать метод(методы) для нахождения наибольшего общего делителя для 4 натуральных чисел.
    */
public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число ");
        int a = sc.nextInt();
        System.out.print("Введите второе число ");
        int b = sc.nextInt();
        System.out.print("Введите третье число ");
        int c = sc.nextInt();
        System.out.print("Введите четвертое число ");
        int d= sc.nextInt();

        System.out.println("NOD = " + NOD(a,b,c,d)); //НОД - наибольший общий делитель


    }
    private static int NOD(int a, int b, int c, int d) {
        int result = 0;
        int min = a;

        int [] array = {a, b, c, d};

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0){
                result = i;
                break;
            }
        }

        return result;
    }
}
