package week1;

public class Sardor {

    public static void main(String[] args) {
        int number = 10;
        System.out.println(oddOrEven(number) );
    }
    public static String oddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
