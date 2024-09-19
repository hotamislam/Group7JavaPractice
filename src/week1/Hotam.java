package week1;

public class Hotam {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("The number " + number + " is " + identifyOddEven(number));
    }

  public static String identifyOddEven(int number) {
      if (number % 2 == 0) {
          return "Even";
      } else {
          return "Odd";
      }
  }

//Hello World

}
