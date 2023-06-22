import java.util.Scanner;
import java.util.*;

/* Задача 8
    В числовой матрице поменять местами два столбца любых столбца,
    т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
    а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        int n = in.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int m = in.nextInt();

        int elements = 0;

        int[][] twoDimArray = new int[n][m];

        System.out.println("Введите матрицу");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                twoDimArray[i][j] = in.nextInt();

        System.out.println("Введите номер столбца для замены");
        int firstColumn = in.nextInt();
        System.out.println("Введите номер столбца, которым заменяем");
        int secondColumn = in.nextInt();
        if (firstColumn > m || secondColumn > m)
            System.out.println("Данные введены некорректно");
        else {
            for (int i = 0; i < n; i++) {
                elements = twoDimArray[i][firstColumn - 1];
                twoDimArray[i][firstColumn - 1] = twoDimArray[i][secondColumn - 1];
                twoDimArray[i][secondColumn - 1] = elements;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    System.out.print(twoDimArray[i][j] + " ");
                System.out.println();
            }

        }
    }
}

