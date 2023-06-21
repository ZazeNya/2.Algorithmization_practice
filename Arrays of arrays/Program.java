import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*; // для математических функций

/* Задача 7
   Сформировать квадратную матрицу порядка N по правилу:
    A[I,J] = sin((sqr(I)+sqr(J))/N)
    и подсчитать количество положительных элементов в ней.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        int n = in.nextInt();
        int plus = 0; //счетчик для положительных элементов

        double[][] twoDimArray = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.2f", (twoDimArray[i][j] = sin((pow(i, 2) - pow(j, 2)) / n)));
                System.out.print("  ");
                if (twoDimArray[i][j] > 0)
                    plus++;
            }
                System.out.println();
        }
        System.out.println("Количество положительных элементов  = " + plus);
    }

}

