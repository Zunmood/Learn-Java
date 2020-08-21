package lesson1;

public class myClass {
/*
 *THIS IS MY FIRST PROGRAM
 */
    public static void main(String[] args) {
        /*
        byte(number, 1 byte)
        short(number, 2 bytes)
        int(number, 4 bytes)
        long(number, 8 bytes)
        float(float number, 4 bytes)
        double(float number, 8 bytes)
        char(a character, 2 bytes)
        boolean(true or false, 1 byte)
        */
        short myVariable = 10;
        float myDecimal=(float)4.5; 
        double myDouble = 11.56;
        char myChar = 'G';
        boolean myBoolean = false;
        int x = 10;
        System.out.println(x);
        System.out.println(myVariable);
        System.out.println(myDecimal);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myDouble);
    }
}