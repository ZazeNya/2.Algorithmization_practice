import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

/* Задача 12
    Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int plus = 0;
        System.out.println("Введите количество строк матрицы");
        int n = in.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int m = in.nextInt();
        Integer[][] arr = new Integer[n][m];
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 15); //заполняем рандомными значениями от 0 до 15
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("По возрастанию");
        for(Integer[] i : arr)  Arrays.sort(i);// по возрастанию
        for(int i=0;i<arr.length;i++)
            System.out.println(Arrays.toString(arr[i]));
        for(Integer[] j : arr) // по убыванию
        {

            Arrays.sort(j, new Comparator<Integer>() {

                @Override
                public int compare(Integer o1, Integer o2) {

                    if(o1<o2) return 1;
                    if(o1>o2) return -1;
                    return 0;
                }
            });
        }
        System.out.println();
        System.out.println("По убыванию");
        for(int i=0;i<arr.length;i++)
            System.out.println(Arrays.toString(arr[i]));

    }
}
