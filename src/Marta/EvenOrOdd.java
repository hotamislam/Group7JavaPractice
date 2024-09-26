package Marta;


public class EvenOrOdd {
/*
Write a method that can identify  a given number is even or odd.
EX:
   identify(5) --> "Odd"
   identify(6) --> "Even"
         */
    public static void main(String[] args) {

        System.out.println(isEvenOrOdd(5));

    }

    public static String isEvenOrOdd(int num){
        if(num % 2 != 0){
            return "Provided number: " + num + " is Odd";
        }else{
           return "Provided number: " + num + " is Even";
        }

    }

}
