import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

/* Задача 12
    Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
    являются числа, сумма цифр которых равна К и которые не большее N.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите K: ");
        int k = in.nextInt();
        System.out.println("Введите N: ");
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        arr=NewArray(k,n);
        System.out.println("Массив: ");
        System.out.println(arr);

    }
    public static List<Integer> NewArray(int k, int n)
    {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= n; i++)
        {
            int j = i, s = 0;
            while (j != 0)
            {
                s += j % 10;
                j /= 10;
            }
            if (s == k) res.add(i);
        }
        return res;
    }
  
}
