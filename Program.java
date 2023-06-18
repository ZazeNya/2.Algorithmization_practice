import java.util.Scanner;
/* Задача 2
Дана последовательность действительных чисел а1 ,а2 ,..., ап.
Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
     */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число Z");
        int num = in.nextInt();
        int j=0;
        int[] array = {4, 6, 7, 65, 87, 45, 34, 32};
        for(int i=0; i<array.length; i++)
        {
            if(array[i]>num) {
                array[i] = num;
                j++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("Количество замен " + j);

    }
}
