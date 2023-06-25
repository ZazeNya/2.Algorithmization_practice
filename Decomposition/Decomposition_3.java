import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Collections;


/* Задача 3
    Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
    треугольника.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину стороны правильного шестиугольника ");
        double a=in.nextDouble();
        System.out.println("Площадь равна: " + Square(a));


    }
    private static double Square(double a) {

        return (((3 * Math.sqrt(3)) / 2) * Math.pow(a, 2));
    }
}
