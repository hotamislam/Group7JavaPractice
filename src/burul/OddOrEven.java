package burul;

public class OddOrEven {
    public static void main(String[] args) {

        //Create a method that can check if a number is odd,even or zero

        int num =20;
        if (num % 2 == 0 ){
            System.out.println(num+ " is even number");
        }else if (num % 2 != 0){
            System.out.println(num+ " is odd number");
        }else {
            System.out.println(num+ " is zero");

        }

        System.out.println("---------------------------------------");
        /*
        1. Create a class named OddOrEven, and write a program that
        can identify if the given number is odd or even
        Ex:
        number = 20

        output:
        20 is an even number: true
        20 is an odd number: false

        Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
         */
        boolean isEven = num % 2 == 0;/*When we divide a number by 2,
        if the remainder is 0
        */
        boolean isOdd = !isEven;// if the number is not even


        System.out.println(num + " is an even number: " + isEven);// true
        System.out.println(num + " is an odd number: "+ isOdd); //false
    }
}
