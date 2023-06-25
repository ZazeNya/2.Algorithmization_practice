import java.util.Scanner;

/* Задача 15
    Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
    (например, 1234, 5789). Для решения задачи использовать декомпозицию.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("4-х значные числа, которые образуют строго возрастающую последовательность");
        int [] a = {5642, 1234, 6789, 3221, 2689, 1568, 3232, 4567, 1479, 3258, 4891, 2459, 7541};

        System.out.println(IncreasingSequence(a));
    }
    private static String IncreasingSequence(int [] a) {
        String s = "";
        int lastDigit  = 0;
        for (int i = 0; i < a.length; i++) {
            int num = a[i], count = 0;
            int arr [] = new int [4];
            for (int j = 0; j < arr.length; j++) {
                lastDigit = num % 10;
                num = num /10;
                arr[arr.length - 1 - j] = lastDigit;
            }
            for (int k = 0; k < arr.length - 1; k++) {
                for (int l = k + 1; l < arr.length; l++)
                    if (arr[k] < arr[l])
                        count++;
            }
            if (count >= 3)
                s += a[i] + " ";
            arr = null;
        }
        return s;
    }
}
