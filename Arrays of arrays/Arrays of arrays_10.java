import java.util.Scanner;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

/* Задача 10
    Найти положительные элементы главной диагонали квадратной матрицы
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        int n = in.nextInt();
        int k=0;
        int[][] twoDimArray = new int[n][n];

        System.out.println("Введите матрицу");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                twoDimArray[i][j] = in.nextInt();
        for (int i=0; i<n; i++) {
            if (twoDimArray[i][i] >= 0) {
                System.out.print(twoDimArray[i][i] + " ");
                k++;
            }
        }

        if(k==0)
            System.out.println("Положительных элементов на главной диагонали введенной матрицы нет");
    }

}

