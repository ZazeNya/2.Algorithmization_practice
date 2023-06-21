import java.util.Scanner;
import java.util.*;

/* Задача 6
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    1 1 1 1 1 1
    0 1 1 1 1 0
    0 0 1 1 0 0
    0 0 1 1 0 0
    0 1 1 1 1 0
    1 1 1 1 1 1
    .....
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите порядок матрицы (число должно быть четным!)");
        int n = in.nextInt();

        int[][] twoDimArray = new int[n][n];

        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j >= n - i || i > j) && (j < n - 1 - i || i < j))
                    System.out.print((twoDimArray[i][j]=0) + " ");
                else
                    System.out.print((twoDimArray[i][j]=1) + " ");

            }
            System.out.println();
        }
    }
}
