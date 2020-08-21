package lesson1;

public class javaString {
    public static void main(String[] args) {
        String myString = "Hello World";
        int myStringLength = myString.length();
        String myStringInLowerCase = myString.toLowerCase();
        String myStringInUpperCase = myString.toUpperCase();
        System.out.println(myString.replace("e", "a"));
        System.out.println(myString.toUpperCase());
        System.out.println(myString.indexOf("o"));
    }
}