package Lesson_2;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {

        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        reversArray();

        //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        writeArray();

        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        calculateArray();

        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        writeTwoArray();


    }

    private static void reversArray() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (mass[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(mass));
        System.out.println();
    }

    private static void writeArray() {
        int[] mass1 = {0,3, 6, 9, 12, 15, 18, 21};
        int[] massResult = new int[8];

        for (int i = 0; i < massResult.length; i++) {
            massResult[i] = mass1[i];
        }
        System.out.println(Arrays.toString(massResult));
        System.out.println();
    }

    private static void calculateArray() {
        int[] mass = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (mass[i] < 6) ? mass[i]*2 : mass[i];
        }
        System.out.println(Arrays.toString(mass));
        System.out.println();
    }

    private static void writeTwoArray() {
        int[][] mass = new int[8][8];
        System.out.println(Arrays.deepToString(mass));
        for (int i = 0; i < 8; i++) {
            mass[i][i] = 1;
        }
        System.out.println(Arrays.deepToString(mass));
        System.out.println();
    }
}
