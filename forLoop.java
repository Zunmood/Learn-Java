package lesson1;

/*
for (init expression increment) {
            execution program
        }
for (int i : myIntArray) {
            execution program
        }
        
*/

public class forLoop {
    public static void main(String[] args) {
        int[] myIntArray = {100 ,52 ,63 ,48 , 95};
        for (int index = 0; index < 5; index++) {
            System.out.println(myIntArray[index]);
        }
        for (int element : myIntArray) {
            System.out.println(element);
        }
        
    }
}