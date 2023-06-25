import java.util.Scanner;
import java.util.*;


/* Задача 4
    На плоскости заданы своими координатами n точек. Написать метод(методы),
    определяющие, между какими из пар точек самое большое расстояние. Указание.
    Координаты точек занести в массив.
    */
public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество точек ");
        int n= in.nextInt();

        int[][] matrix = new int[n][2];//для координат точек X Y

        initMatrix(matrix);

        System.out.println();
        System.out.print("Координаты точек:     ");
        for (int c = 0; c < matrix.length; c++){
            System.out.println();
            for (int l = 0; l < matrix[0].length; l++) {
                System.out.print( matrix[c][l] + "    ");
            }
        }

        System.out.println();
        int [] arr = Distance(matrix);

        System.out.println();
        System.out.println("Наибольшее расстояние между этими координатами двух точек :");

        for (int elem : arr ) {
            System.out.print(elem + " ");
        }
    }
    private static void initMatrix(int[][] matrix) {//метод для случайного подбора координат точек
        if (matrix == null) {
            return;
        }
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = rand.nextInt(10) - 5;
            }
        }
    }
    private static int[] Distance(int[][] matrix) { //метод для нахождения самого большого расстояния между двумя точеками

        double xy;
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;

        double max = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            xy = Math.sqrt(Math.pow( (matrix[i + 1][0] - matrix[i][0]), 2) + Math.pow((matrix[i + 1][1] - matrix[i][1]), 2) );

            if (xy > max ) {
                max = xy;
                x1 = matrix[i][0];
                x2 = matrix[i + 1][0];
                y1 = matrix[i][1];
                y2 = matrix[i + 1][1];
            }
        }
        return new int[] {x1, y1, x2, y2};
    }

}
