import java.util.Scanner;
import java.util.*;

/* Задача 7
     Даны действительные числа а1 ,а2 ,..., аn. Найти max(a1+a2n, a2n+a2n-1,...,an+an-1)
    Найдем max (ai+an, a(i+1)+a(n-1), ....)
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
        int sum=getMaxSum(array);
        System.out.println(sum);
    }
    public static int getMaxSum(int[] array) {//for problems 7
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        return maxSum;
    }
}
