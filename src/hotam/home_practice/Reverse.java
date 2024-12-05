package hotam.home_practice;

public class Reverse {

    public static void main(String[] args) {

        String str = "ABCD";
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);


    }

}
