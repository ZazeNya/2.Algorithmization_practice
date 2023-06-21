import java.util.Scanner;
import java.util.*;

/* Задача 9
    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
    Если таких чисел несколько, то определить наименьшее из них.
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
        int numbers=mode(array);
        System.out.println(numbers);
        //если в массиве все числа будут повторяться единожды
        //программа выведет наименшее из них

    }
    public static int mode(int[] n) //метод для нахождения минимального часто встречаемого элемента введенного массива
    {
        Arrays.sort(n); //сортировка массива

        int count2 = 0;
        int count1 = 0;
        int pupular1 =0;
        int popular2 =0;


        for (int i = 0; i < n.length-1; i++)
        {
            pupular1 = n[i];
            count1 = 1;    //смотрим следующий элемент, с учетом этого (он уже встретился 1 раз)

            for (int j = i + 1; j < n.length; j++)
            {
                if (pupular1 == n[j]) count1++;
            }

            if (count1 > count2)
            {
                popular2 = pupular1;
                count2 = count1;
            }

            else if(count1 == count2)
            {
                popular2 = Math.min(popular2, pupular1);
            }
        }

        return popular2;
    }

}

