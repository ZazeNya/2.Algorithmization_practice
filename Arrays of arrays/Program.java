import java.util.Scanner;
import java.util.*;
import static java.lang.Math.*;

/* Задача 11
    Матрицу 10x20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
    */
public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int plus = 0;
        int[][] twoDimArray = new int[10][20];

        System.out.println("Матрица: ");

        String s = "Больше трех раз 5 повторяется в строках: ";
        for (int i = 0; i < 10; i++){
            int count = 0;
            for (int j = 0; j < 20; j++){
                twoDimArray[i][j] = (int) (Math.random() * 15);
                System.out.print(twoDimArray[i][j] + "\t");
                if (twoDimArray[i][j] == 5){
                    count ++;
                }
            }
            System.out.println();
            if (count >= 3){
                s = s + i + "\t";
                plus++;
            }
        }
        System.out.println();
        if(plus==0)
            System.out.println("Строк с числом 5, которое встречается 3 и более раз, нет");
        else
            System.out.println(s);

    }
}
