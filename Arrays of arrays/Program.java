import java.util.Scanner;
import java.util.*;

/* Задача 2
    Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы");
        int n = in.nextInt();


        int[][] twoDimArray = new int[n][n];
        System.out.println("Введите матрицу");
        for (int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                twoDimArray[i][j]=in.nextInt();

        for (int i=0; i<n; i++)
            System.out.print(twoDimArray[i][i] + " "); //первая диагональ
        System.out.println();

        for(int i=0; i<n; i++)
            System.out.print(twoDimArray[i][n-1-i] + " ");//вторая диагональ
    }

}
