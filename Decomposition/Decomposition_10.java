import java.util.Scanner;
import java.util.*;


/* Задача 10
    Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
    являются цифры числа N.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n=in.nextInt();
        int [] array = CreateArr(n);
        System.out.println("Массив: ");
        for (int elem : array)
            System.out.print(elem + " ");
    }
    private static int [] CreateArr(int n) {
        int num = n, m = 0, res = 0;
        while (num > 0) {
            num /= 10;
            m++;
        }
        int [] arr = new int [m];
        for (int i = 0; i < arr.length; i++) {
            res = n % 10;
            n = n /10;
            arr[arr.length - 1 - i] = res;
        }
        return arr;
    }
}
