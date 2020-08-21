package lesson1;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int enteredNumber = scan.nextInt();
        System.out.println("The entered number is " + enteredNumber);
        System.out.println("Enter a number");
        Double enteredDouble = scan.nextDouble();
        System.out.println("The entered number is " + enteredDouble);
        System.out.println("What is your name");
        String enteredString = scan.next();
        System.out.println("My name is  " + enteredString);
    }
}