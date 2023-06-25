import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

/* Задача 2
   Даны две последовательности а1<=a2<=...an и b1<=b2<=...bm.
   Образовать из них новую последовательностьчисел так, чтобы
   она была неубывающей. Дополнительный массив не использовать.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер первого массива");
        int n = in.nextInt();
        System.out.println("Введите размер второго массива");
        int m = in.nextInt();

        int[] arrayFirst = new int[n];
        int[] arraySecond = new int[m];
        System.out.println("Введите первый массив");
        for(int i=0; i<n;i++)
            arrayFirst[i]=in.nextInt();
        System.out.println();
        System.out.println("Введите второй массив");
            for(int i=0; i<m;i++)
                arraySecond[i]=in.nextInt();
        System.out.println();

        System.out.println("Новый массив");
        System.out.println(Arrays.toString(newArray(arrayFirst,arraySecond)));

    }
    private static int[] newArray(int[] arr1, int[] arr2)
    {
        if(arr1 == null && arr2 == null) return null;
        if(arr1 == null) return arr2;
        if(arr2 == null) return arr1;
        if(arr1.length == 0) return arr2;
        if(arr2.length == 0) return arr1;


        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1,0,result,0,arr1.length);
        System.arraycopy(arr2,0,result,arr1.length,arr2.length);

        int h = 1;
        while(h * 3 < result.length)
            h = h * 3 + 1;

        while(h >= 1)
        {
            for(int i = h;i < result.length; i++)
            {
                for(int j = i; j >= h; j-=h)
                {
                    if(result[j] < result[j - h])
                    {
                        int tmp = result[j];
                        result[j] = result[j - h];
                        result[j - h] = tmp;
                    }
                    else break;
                }
            }
            h = h/3;
        }

        return result;
    }
}
