package Lesson_1;

public class mainClass {
    public static void main(String[] args) {
        //3.
        System.out.println("Результат: " + calculateExpression(1, 2, 3, 4));
        System.out.println();
        //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
        // пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        System.out.println("Результат: " + verifyInclusion(2, 10));
        System.out.println();
        //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        // в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        positiveOrNegative(-10);
        System.out.println();
        //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        System.out.println("Результат: " + positiveOrNegativeBoolean(10));
        System.out.println();
        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        printName("Андрей");

    }

    private static float calculateExpression(float a, float b, float c, float d) {
        System.out.println("Задание 3. Вычислить выражение: " + a + " * (" + b + " + (" + c + " / " + d + "))");
        float result;
        result = a * (b + (c / d));
        return result;
    }

    private static Boolean verifyInclusion(Integer a, Integer b) {
        boolean result;
        System.out.println("Задание 3. сумма лежит в пределах от 10 до 20(включительно)");
        result = 10 <= (a + b) & (a + b) <= 20;
        return result;
    }

    private static void positiveOrNegative(Integer a) {
        if (a >= 0) {
            System.out.println("Задание 4. число: " + a + " -> положительное");
        } else {
            System.out.println("Задание 4. число: " + a + " -> отрицательное");
        }
    }

    private static boolean positiveOrNegativeBoolean(Integer a) {
        System.out.println("Задание 6. Число: " + a + " отрицательное?");
        return a < 0;
    }

    private static void printName(String str) {
        System.out.println("Задание 4. Привет, " + str + "!");
    }
}