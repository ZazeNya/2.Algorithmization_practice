import java.util.Scanner;
import java.util.*;

/* Задача 5
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    1  1  1  1
    2  2  2  0
    3  3  0  0
    .....
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите порядок матрицы (число должно быть четным!)");
        int n = in.nextInt();

        int[][] twoDimArray = new int[n][n];

        for(int i=0; i<n; i++) {
            for (int j = n-1; j >= 0; j--) {
                if(i<=j)
                    System.out.print((twoDimArray[i][j]=i+1) + " ");
                else
                    System.out.print(twoDimArray[i][j] + " ");

            }
            System.out.println();
        }
    }
}
