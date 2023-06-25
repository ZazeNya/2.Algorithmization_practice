import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

/* Задача 15
   Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        int n = in.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int m = in.nextInt();
        Integer[][] arr = new Integer[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 15); //заполняем рандомными значениями от 0 до 15
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int maxElement = arr[0][0];
        for (int i = 0; i < n; i++) { //поиск максимального элемента
            for (int j = 0; j < m; j++)
                if (arr[i][j] > maxElement)
                    maxElement = arr[i][j];

        }
        System.out.println();
        System.out.println("Матрица с заменами");
        for (int i = 0; i < n; i++) { //замена
            for (int j = 0; j < m; j++) {
                if (arr[i][j] % 2 == 1)
                    arr[i][j] = maxElement;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
