import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

/* Задача 1
   Заданы два одномерных массива с различным количеством элементов и натуральное число k.
    Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого,
    при этом не используя дополнительный массив.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер первого массива");
        int n = in.nextInt();
        System.out.println("Введите размер второго массива");
        int m = in.nextInt();
        System.out.println("Введите k");
        int k = in.nextInt();
        int[] arrayFirst = new int[n+m];
        int[] arraySecond = new int[m];
        for(int i=0; i<n;i++) {
            arrayFirst[i] = (int) (Math.random() * 15);//заполняем рандомными значениями от 0 до 15
            System.out.print(arrayFirst[i] + " ");
        }
        System.out.println();
            for(int i=0; i<m;i++) {
                arraySecond[i] = (int) (Math.random() * 15);//заполняем рандомными значениями от 0 до 15
                System.out.print(arraySecond[i] + " ");
            }
        System.out.println();
        arrayFirst=uniteArrays(arrayFirst, arraySecond, k, n,m );
        System.out.println(Arrays.toString(arrayFirst));

    }
    public static int[] uniteArrays(int[] a1, int[] a2, int k, int n, int m)
    {

        int i,p;

        int res[]=new int[n+m];

        p=0;
        for (i=0; i<k;   i++)   res[p++]=a1[i];
        for (i=0; i<m; i++)   res[p++]=a2[i];
        for (i=k; i<n; i++)   res[p++]=a1[i];

        return res;

    }
}
