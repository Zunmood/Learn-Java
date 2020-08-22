package lesson1;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int enteredNumber = sc.nextInt();
        System.out.println("The entered number is " + enteredNumber);
        System.out.println("Enter a number");
        Double enteredDouble = sc.nextDouble();
        System.out.println("The entered number is " + enteredDouble);
        System.out.println("What is your name");
        String enteredString = sc.next();
        System.out.println("My name is  " + enteredString);
    }
}
