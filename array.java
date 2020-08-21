package lesson1;

public class array {
    public static void main(String[] args) {
        int[] myIntArray = {100 ,52 ,63 ,48 , 95};       
        /*
        int[] myIntArray = new int[]{1 ,2 ,3 ,4 , 5};
        int[] myIntArray = new int[3];
        int[] myIntArray = {1 ,2 ,3 ,4 , 5};
        */
        int index = 0;
        while (index < 5) {
            System.out.println(myIntArray[index]);
            index++;
        }
    }
}