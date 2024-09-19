package week1;

public class Elmira {
    public static void main(String[] args) {

        /*
        Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
         */


        int n1 = 5;
        System.out.println(n1+" is "+identifyOddEven(n1));


        int n2 = 6;
        System.out.println(n2+" is "+identifyOddEven(n2));




    }


        public static String identifyOddEven(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }



}}
