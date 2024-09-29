package Elmira;

public class SwapNumbers {
    public static void main(String[] args) {

       // Swap two int variables' values without using a third variable

        int a = 40;
        int b =30;

        a = b + a;// so now 'a' is going to be =70
//      a=  30+40=70


        b = a - b; // 'b' is going to be = 40
//      b=  70-30=40

//so now we have :
//     int a = 70;
//     int b = 40;


        //next step is

        a = a - b; // 'a' is going to be 30

        //so no 'a' and 'b' is swapped
        System.out.println("a = " + a);//30
        System.out.println("b = " + b);//40


    }
}
