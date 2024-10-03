package hotam.home_practice;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 10;//15
        int b = 5;//10

        a= a+b;
        b=a-b;
        a= a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
