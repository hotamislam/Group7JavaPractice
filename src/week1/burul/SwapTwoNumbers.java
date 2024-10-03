package week1.burul;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        //Swap two numbers w/o using third variable

    //int variables
    int x = 10;//
    int y = 20;

        System.out.println("Before swapping :" + " x=" + x + " y=" + y);

    //Swapping the two numbers with math

        x =x +y;//10+20 =30 -> x=30

        y= x-y;//30-20=10 -> y=10

        x= x-y;//30-10=20 -> x=20

        //System.out.println("x: " + x);//20
        //System.out.println("y: " + y);//10
        System.out.println("After swapping: " + " x=" + x + " y=" + y);

}
}
