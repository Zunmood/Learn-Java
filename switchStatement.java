package lesson1;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("How much did you get in your math test out of 5");
        int score = sc.nextInt();
        switch (score) {
            case 1:
                System.out.println("You need to work on your math");
                break;
            case 2:
                System.out.println("You can do better");
                break;
            case 3:
                System.out.println("You are OK");
                break;
            case 4:
                System.out.println("You are Good");
                break;
            case 5:
                System.out.println("You are Excellent");
                break;
            default:
            System.out.println("Please enter your score");
                break;
        }
    }
}