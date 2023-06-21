import java.util.Scanner;
import java.util.*;

/* Задача 1
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
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
        for (int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                twoDimArray[i][j]=in.nextInt();

        int k=0;
        for (int i=0; i<n; i++)
            for(int j=0; j<m; j+=2)
            {
                if(twoDimArray[0][j] > twoDimArray[n-1][j]) {
                    System.out.print(twoDimArray[i][j] + " ");
                    k++;
                }
            }
        if(k==0)
            System.out.println("Нет столбцов, которые подходят по условию");
    }

}
