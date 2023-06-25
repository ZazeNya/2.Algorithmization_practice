import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

/* Задача 16
   Магическим квадратом порядка n называется квадратная матрица размера nxn,
    составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу,
    каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите порядок матрицы");
        int n = in.nextInt();
        int[][] matrix = generateMagicSquare(n);

        for (int[] each : matrix) {
            System.out.println(Arrays.toString(each));
        }
    }

    public static int[][] generateMagicSquare(int n) { //генерация магического квадрата
        int[][] matrix = new int[n][n];
        int row = n - 1;
        int col = n / 2;
        matrix[row][col] = 1;

        for (int i = 2; i <= n * n; i++) {
            if (matrix[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            } else {
                row = (row - 1 + n) % n;
            }
            matrix[row][col] = i;
        }

        return matrix;
    }
}
