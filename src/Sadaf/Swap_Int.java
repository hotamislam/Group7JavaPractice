package Sadaf;

public class Swap_Int {
    public static void main(String[] args) {


        int a = 5;
        int b = 10;

        a = a + b;  // a becomes 15 (5+10)
        b = a - b;  // b becomes 5 (15-10)
        a = a - b;  // a becomes 10 (5-5)

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
