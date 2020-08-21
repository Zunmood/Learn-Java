package lesson1;

public class logicalOperators {
    public static void main(String[] args) {
        int subject1 = 40;
        int subject2 = 60;
        //&&-->AND ||--> OR
        if ((subject1 >= 35) && (subject2 >= 35)) {
            System.out.println("You Have Passed!!");
        } else {
            System.out.println("You Hava Failed");
        }
        if ((subject1 >= 35) || (subject2 >= 35)) {
            System.out.println("You have only passed one test");
        } else {
            System.out.println("You Have Failed Completely");
        }
    }
}