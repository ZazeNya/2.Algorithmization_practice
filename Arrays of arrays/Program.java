import java.util.Scanner;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

/* Задача 9
    Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
    Определить, какой столбец содержит максимальную сумму.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы");
        int n = in.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int m = in.nextInt();

        int sumMax=0;
        Map<Integer, Integer> Numbers = new HashMap<>();

        int[][] twoDimArray = new int[n][m];

        System.out.println("Введите матрицу");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                twoDimArray[i][j] = in.nextInt();

        for (int j = 0; j < m; j++) {
            sumMax=0;
            for (int i = 0; i < n; i++) {
                    sumMax+=twoDimArray[i][j];
            }
            Numbers.put(j+1,sumMax);
        }

        int maxValue = Collections.max(Numbers.values());
        List<Integer> maxValueKeys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : Numbers.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxValueKeys.add(entry.getKey());
            }
        }
        System.out.print("Номер столбца ");
        System.out.println(maxValueKeys);
        System.out.print("Максимальная сумма ");
        System.out.println(Collections.max(Numbers.values()));

    }

}

