import java.util.Scanner;
import java.util.*;

/* Задача 3
    Дана матрица. Вывести k-ю строку и p-й столбец матрицы
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        int n = in.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int m = in.nextInt();

        int[][] twoDimArray = new int[n][m];
        System.out.println("Введите матрицу");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                twoDimArray[i][j] = in.nextInt();

        System.out.println("Введите номер строки, которую нужно вывести");
        int k = in.nextInt();

        System.out.println("Введите номер столбца, который нужно вывести");
        int p = in.nextInt();

        if (k > n || p > m)
            System.out.println("Error");
        else {

            System.out.println("Строка: ");
            for (int j = 0; j < m; j++)
                System.out.print(twoDimArray[k - 1][j] + " ");

            System.out.println("Столбец: ");
            for (int i = 0; i < n; i++)
                System.out.print(twoDimArray[i][p - 1] + " ");

        }
    }
}
