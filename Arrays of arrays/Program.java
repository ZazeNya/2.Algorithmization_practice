import java.util.Scanner;
import java.util.*;

/* Задача 4
    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
     1  2   3  ... n
     n n-1 n-2 ... 1
     .....
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите порядок матрицы (число должно быть четным!)");
        int n = in.nextInt();

        int[][] twoDimArray = new int[n][n];

        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2==0)
                    System.out.print((twoDimArray[i][j]=j+1) + " ");
                else
                    System.out.print((twoDimArray[i][j]= n-j) + " ");

            }
            System.out.println();
        }
    }
}
