package week1.Ismail_package;

public class oddOrEven {

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(6);
    }

    public static void oddOrEven (int n) {

        if (n % 2 == 0){
            System.out.println(n + " is Even");
        }else{
            System.out.println(n + " is Odd");
        }

    }

    /*
    numbers odd & even
    write a method that can identify a given number is even or odd
    EX:
    5 -> odd    6 -> even

     */


}
