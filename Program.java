import java.util.Scanner;
import java.util.*;
/* Задача 3
    Дан массив действительных чисел, размерность которого N.
    Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
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
        int plus=0, minus=0, nol=0;
        for(int i=0; i<n; i++)
        {
            System.out.print(array[i] + " ");
            if(array[i]==0)
                nol++;
            else if(array[i]>0)
                plus++;
            else minus++;
        }
        System.out.println();
        System.out.println("Положительных элементов " + plus + ", отрицательных " + minus + ", нулевых " + nol);

    }
}
