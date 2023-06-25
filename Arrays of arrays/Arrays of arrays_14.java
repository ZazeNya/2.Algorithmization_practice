import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

/* Задача 14
    Сформировать случайную матрицу m x n,
    состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        int n = in.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int m = in.nextInt();
        if (m<n) System.out.println("Не корректные данные.\nНе соответствует условию задачи");
        else {
            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j >= i) matrix[i][j] = 1;
                    else matrix[i][j] = 0;
                }
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arrayList.add(matrix[j][i]);
                }
                Collections.shuffle(arrayList);
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = arrayList.get(j);
                }
                arrayList.clear();
            }
            System.out.println();
            for (int[] each : matrix) {
                System.out.println(Arrays.toString(each));
            }
        }

    }
}
