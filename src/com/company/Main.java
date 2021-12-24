package com.company;

public class Main {

    public static void COFFEE(String coffee) {
        System.out.println("Кипячение воды");
        System.out.println("Насыпать кофе в кружку " + coffee);
        System.out.println("Налить кипятка");
        System.out.println("Добавить сахар и молоко по желанию");
        System.out.println("Употребить и чувствовать себя бодрым весь оставшийся день");
    }

    public static void main(String[] args) {
        System.out.println("ЗАВТРАК");
        COFFEE("Американо");

        System.out.println("ОБЕД");
        COFFEE("Каппучино");

        System.out.println("УЖИН");
        COFFEE("Черный как моя душа кофе");

        addition(-12, 1, "Йо"); // аргументы

        int result = multiply(5, 5);
        System.out.println(result);
        System.out.println(multiply(10, 5));
        System.out.println(multiply(100, 7) + multiply(3, 12) - multiply(968690, 0));
        String str = concat(3, "SO-so", '!');
        System.out.println(str);
    }

    public static String concat(double digit, String phrase, char symbol) { // возвращаемый метод с входящими параметрами
        return digit + " " + phrase + " " + symbol;
    }

    public static int multiply(int num1, int num2) { // возвращаемый метод с входящими параметрами
        return num1 * num2;
    }



    public static void addition(int NUMBER1, int NUMBER2, String word) {
        System.out.println(NUMBER1 + NUMBER2);
        System.out.println(word);
    }

}
/* невозвращаемый метод без входящих параметров (пустая скобка)
 А Если в скобках есть параметры то это невозвращающие парметры с вхлдящими параметрами
*/
