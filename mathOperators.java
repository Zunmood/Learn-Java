package lesson1;

import java.util.Scanner;

public class mathOperators {
    public static void main(final String[] args) {
        double x, y, answer, answer2, answer3;
        x = 20;
        y = 40;
        double answer4;
        final String z = "The answer is ";
        answer = x + y;
        System.out.println(z + answer);
        answer2 = x - y;
        System.out.println(z + answer2);
        answer3 = x / y;
        System.out.println(z + answer3);
        //If the variable is declared int then, the result is also int
        //math operators are + - * / %
    }
}