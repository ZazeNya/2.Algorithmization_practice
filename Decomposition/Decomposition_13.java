import java.util.Scanner;

/* Задача 13
    Два простых числа называются «близнецами», если они отличаются друг от друга на 2
    (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где
    n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите n>2");
        int n=in.nextInt();
        int[][] matrix = NumberTwins(n);
        System.out.println("Пары 'близнецов'");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static int[] NewArray(int number) { //заполняем массив
        int[] array = new int[(2 * number - number) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = number + i;
        }
        return array;
    }
    public static int[][] NumberTwins(int number) { //создаем матрицу из чисел-близнецов
        int[][] matrix = new int[2 * number - number - 1][2];
        for (int i = 0; i < NewArray(number).length - 2; i++) {
            matrix[i][0] = NewArray(number)[i];
            matrix[i][1] = NewArray(number)[i + 2];
        }
        return matrix;
    }
}
