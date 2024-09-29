package Ismail_package;

public class Swap_Int {

    /*
    ➡️  swapTwoNumbers:
Swap two int variables' values without using a third variable
     */
    public static void main(String[] args) {

        int num1 = 10; // 20
        int num2 = 20; // 10

        num1 = num1+num2; // 30
        num2 = num1 - num2; // num1 = 30 , num = 10
        num1 = num1 - num2;



        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
