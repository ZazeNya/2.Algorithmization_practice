import java.util.Scanner;
import java.util.*;

/* Задача 10
    Дан целочисленный массив с количеством элементов n.
    Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
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

        for (int i = 1; i < n; i += 2) {
            array[i] = 0;
        }
        System.out.println("Новый массив: " + Arrays.toString(array));
    }

}
