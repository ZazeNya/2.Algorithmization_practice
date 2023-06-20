import java.util.Scanner;
import java.util.*;
/* Задача 4
    Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
     */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива ");
        Random r=new Random();
        int n = in.nextInt();
        int array[] = new int[n];
        for (int i=0; i<n; i++)
        {
            array[i]=r.nextInt();
        }
        int max = array[0];//пусть первое число массива будет максимальным
        int min = array[0];//пусть первое число массива будет минимальным
        int iMax = 0; //начальный индекс максимального числа
        int iMin = 0; //начальный индекс минимального числа
        for (int i=1; i<n; i++)
        {
            if (array[i] > max) {
                max = array[i];
                iMax = i;
            }
            //определяем минимальное число и его индекс
            if (array[i] < min) {
                min = array[i];
                iMin = i;
            }

        }
        int result = array[iMax];
        array[iMax] = array[iMin];
        array[iMin] = result;
        System.out.println(Arrays.toString(array));

    }
}
