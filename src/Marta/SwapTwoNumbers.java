package Marta;

public class SwapTwoNumbers {
/*
Swap two int variables' values without using a third variable
 */

    public static void main(String[] args) {

        int var1 = 5;
        int var2 = 10;

        System.out.println("Before swap:\n" + var1 + ", " + var2);

        //holds the sum of var1 and var2:  Now --> var1 = 15; var2 = 10;
        var1 = var1 + var2;

        /*from var1 which = 15, Subtract var2 which = 10 and assign it to var2.
        15-10=5 --> var2 = 5;
        Now var2 hold the original value of var1 */
        var2 =  var1 - var2;

        /*
        from var1, which = 15, Subtract var2 which = 5
        Now var1 hold the original value of var2
         */
        var1 = var1 - var2;

        System.out.println("After swap:\n" + var1 + ", " + var2);




    }
}
