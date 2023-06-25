import java.util.Scanner;
import java.util.*;


/* Задача 9
     Даны числа X, Y, Z, Т — длины сторон четырехугольника.
     Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите: ");
        System.out.print("X: ");
        double x=in.nextDouble();
        System.out.print("Y: ");
        double y=in.nextDouble();
        System.out.print("Z: ");
        double z=in.nextDouble();
        System.out.print("T: ");
        double t=in.nextDouble();
        System.out.println("Площадь  четырехугольника " + Area(x, y, z, t));

    }
    private static double Area(double x, double y, double z, double t) {

        double s1 = 0 , s2 = 0, result = 0, c = 0;
        s1 = (double) 1/2 *  x * y;
        c = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2) );
        s2 = (double) 1/4 * Math.sqrt(  (4 * Math.pow(z, 2) * Math.pow(t, 2)) - Math.sqrt( Math.pow(z,2))
                + Math.pow(t, 2) + Math.pow(c, 2));
        result = s1 + s2;
        return result;
    }
}
