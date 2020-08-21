package lesson1;

public class doWhileLoops {
    public static void main(String[] args) {
        int a = 0;
        while (a <= -1) {
            System.out.println(a);
            a++;
        }
        // while loop checks the condition first then executes
        System.out.println("----------------------------");
        // do-while loop executes the program then checks
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b <= -1);
        //The DO-WHILE loop executes the program atleast once even if the condition is false 'cause it executes then checks the condition
    }
}