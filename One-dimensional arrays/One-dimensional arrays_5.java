import java.util.Scanner;
import java.util.*;
/* Задача 5
    Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
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
        for(int i=0; i<n; i++)
        {
            if(array[i]>i)
                System.out.print(array[i] + " ");
        }
    }
}
