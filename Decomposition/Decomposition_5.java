import java.util.Scanner;
import java.util.*;


/* Задача 5
    Составить программу, которая в массиве A[N] находит второе по величине число
    (вывести на печать число, которое меньше максимального элемента массива, но больше
    всех других элементов).
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел ");
        int n= in.nextInt();
        int[] arr = new int[n];
        initArray(arr);
        System.out.print("Массив ");
        for (int element : arr){
            System.out.print( element + " ");
        }
        System.out.println();
        System.out.println("Второе по величине число в массиве: " + MaxSecond(arr));


    }
    private static void initArray(int[] arr) {

        if (arr == null) {
            return;
        }

        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
    }

    private static int MaxSecond(int[] arr) {
        int max2 = arr[0];

        int max = Arrays.stream(arr).max().getAsInt();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (max2 < arr[j] && arr[j] < max) {
                    max2 = arr[j];
                }
            }
        }
        return max2;
    }

}
