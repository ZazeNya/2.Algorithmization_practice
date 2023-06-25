import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Collections;

/* Задача 3
    Написать алгоритм сортировки выбором
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int n = in.nextInt();


        int[] array = new int[n];

        System.out.println("Введите массив");
        for(int i=0; i<n;i++)
            array[i]=in.nextInt();

        for (int left = 0; left < n; left++) {
            int minInd = left;
            for (int i = left; i < n; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
