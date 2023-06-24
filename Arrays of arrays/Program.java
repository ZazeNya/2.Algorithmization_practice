import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

/* Задача 13
    Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
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
        Integer[][] arrayTransp = ArrayTransp(arr, n,m); //обращаемся к методу и транспонируем матрицу


        System.out.println();
        System.out.println("По возрастанию");
        for(Integer[] i : arrayTransp)  Arrays.sort(i);// по возрастанию
        Integer[][] arrayTwoTransp= ArrayTransp(arrayTransp, m,n);
        for(int i=0;i<arrayTwoTransp.length;i++) {
            System.out.println(Arrays.toString(arrayTwoTransp[i]));
        }
        for(Integer[] j : arrayTransp) // по убыванию
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
        Integer[][] arrayThreeTransp = ArrayTransp(arrayTransp, m,n);
        for(int i=0;i<arrayThreeTransp.length;i++)
            System.out.println(Arrays.toString(arrayThreeTransp[i]));

    }
    public static Integer[][] ArrayTransp(Integer[][] array, int n, int m)
    {
        Integer[][] arrayTwo = new Integer[m][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<m; j++)
                arrayTwo[j][i]=array[i][j];
        return arrayTwo;
    }
}
