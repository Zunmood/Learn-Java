package lesson1;

public class incrementDecrement {
    public static void main(String[] args) {
    int x = 10;
    System.out.println(x);
    //post increment
    x++;
    System.out.println(x);  
    //pre increment
    ++x;
    System.out.println(x); 
    System.out.println(x++);
    //This incrementation only works in the next usage of x
    System.out.println(x);

    x += 3;//it is the same as x=x+3
    System.out.println(x);
    /*
    x += 3 is the same as x=x+3
    x -= 3 is the same as x=x-3
    x *= 3 is the same as x=x*3
    x /= 3 is the same as x=x/3
    x %= 3 is the same as x=x%3
    */
    }
}