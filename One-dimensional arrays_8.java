import java.util.Scanner;
import java.util.*;

/* Задача 8
   Дана последовательность целых чисел а1 ,а2 ,..., аn.
    Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
     */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива ");
        int n = in.nextInt();
        int[] array = new int[n];
        System.out.println("Введите массив ");
        for(int i=0; i<n; i++)
            array[i]=in.nextInt();
        int[] arrayNew = deleteMinValue(array);
        System.out.println(Arrays.toString(arrayNew));
    }
    public static int[] deleteMinValue(int[] array) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Массив нулевой длины!");
        }

        int minCount = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];

            }
        }

        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }

        int[] result = new int[array.length - minCount];

        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }
        return result;
    }

}
