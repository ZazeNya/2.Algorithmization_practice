import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Collections;

/* Задача 7
    Пусть даны 2 неубывающие последовательности действительных чисел а1<=a2<=...an и b1<=b2<=...bm.
    Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...bm
    в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер первого массива");
        int n = in.nextInt();
        int[] array1 = new int[n];
        System.out.println("Введите первый массив");
        for (int i = 0; i < n; i++)
            array1[i] = in.nextInt();
        System.out.println("Введите размер второго массива");
        int m = in.nextInt();
        int[] array2 = new int[m];
        System.out.println("Введите второй массив");
        for (int i = 0; i < m; i++)
            array2[i] = in.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (j == 0) {
                    if (array2[i] <= array1[j]) {
                        System.out.println("Значение " + array2[i] + " вставить до " + (j+1) + " элемента в первом массиве");

                    } else if (array2[i] >= array1[j] && array2[i] <= array1[j + 1]) {
                        System.out.println("Значение " + array2[i] + " вставить до " + (j+1) + " элемента в первом массиве");
                    }

                } else if (j == array1.length - 1) {
                    if (array2[i] > array1[j]) {
                        System.out.println("Значение " + array2[i] + " втавить после " + (j+1) + " элемента в первом массиве");
                    }
                } else if (j != 0 && j != array1.length - 1) {
                    if (array2[i] >= array1[j] && array2[i] <= array1[j + 1]) {
                        System.out.println("Значение " + array2[i] + " втавить после " + (j+1) + " элемента в первом масссиве");
                    }
                }
            }
        }
    }
}
