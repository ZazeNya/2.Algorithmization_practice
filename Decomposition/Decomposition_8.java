import java.util.Scanner;
import java.util.*;


/* Задача 8
     Задан массив D. Определить следующие суммы:
     D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
     Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
     элементов массива с номерами от k до m.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер массива");
        int n=in.nextInt();
        int k = rand.nextInt(n);
        int m = k + 2;
        int [] arr = new int[n];
        initArray(arr);
        System.out.println("Массив");
        for (int elem : arr )
            System.out.print(elem + " ");
        System.out.println();
        System.out.print("Сумма трех последовательно расположенных элементов массива от " + k  + " до " + m + ": ");
        System.out.println(SumElements(arr, k, m));
    }
    private static void initArray(int[] arr) {

        if (arr == null)
            return;
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextInt(10);
    }
    private static int SumElements(int[] arr, int k, int m) {

        int result = 0;
        for (int i = k-1; i < m; i++ )
            result += arr[i];
        return result;
    }
}
