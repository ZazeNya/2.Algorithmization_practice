import java.util.Scanner;


/* Задача 11
    Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int NumberFirst=in.nextInt();
        System.out.println("Введите второе число: ");
        int NumberSecond=in.nextInt();
        if (CalculateNum(NumberFirst, NumberSecond) > 0) {
            if (CalculateNum(NumberFirst, NumberSecond) == NumberFirst)
                System.out.println(NumberFirst + " больше цифр");
            else if (CalculateNum(NumberFirst, NumberSecond) == NumberSecond)
                System.out.println(NumberSecond + " больше цифр");
        } else if (CalculateNum(NumberFirst, NumberSecond) == 0)
            System.out.println("Одинаковое количество цифр");
    }
    private static int CalculateNum(int n, int m) {

        int num1 = n, num2 = m, count1 = 0, count2 = 0, result = 0;
        while (num1 > 0) {
            num1 /= 10;
            count1++;
        }
        while (num2 > 0) {
            num2 /= 10;
            count2++;
        }
        if (count1 > count2)
            result = n;
        else if (count1 < count2)
            result = m;
        else if (count1 == count2)
            result = 0;
        return result;
    }
}
