import java.util.Scanner;
import java.util.*;
/* Задача 6
    Задана последовательность N вещественных чисел.
    Вычислить сумму чисел, порядковые номера которых являются простыми числами. 
     */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива ");
        int n = in.nextInt();
        int sum=0, j=0;
        int[] array = new int[n];
        System.out.println("Введите массив ");
        for(int i=0; i<n; i++)
            array[i]=in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(sieveOfEratosthenes(n));
        for (int i=0; i<list.size(); i++)
        {
            sum+=array[list.get(i)-1];
        }
        System.out.println("Сумма элементов массива, порядковые номера которых являются простыми числами, равна = " + sum );
        //с учетом, что нумерация элементов массива начинается с 0
    }
    public static List<Integer> sieveOfEratosthenes(int n) //решето Эратосфена
    {
        int[] a = new int[n + 1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {      // инициализировать все числа как простые
            a[i] = 1;
        }

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (a[i] == 1)                  // проверяет, является ли `i` простым числом
            {
                for (int j = 2; i * j <= n; j++) {
                    a[i * j] = 0;           // числа, кратные `i`, не являются простыми
                }
            }
        }

        for (int i = 2; i <= n; i++)
        {
            if (a[i] == 1) {
                list.add(i);  // печатает простые числа
            }
        }
        return list;
    }
}
