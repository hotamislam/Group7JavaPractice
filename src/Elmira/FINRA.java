package Elmira;

public class FINRA {
    public static void main(String[] args) {

        //Write a function that prints out the numbers from 1 to 30 but
        // for numbers that are a multiple of 3,print "FIN" instead of the number,
        // and for numbers that are a multiple of 5, print "RA" instead of the number.
        // For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.


        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {//multiple of both 3 and 5, print "FINRA"
                System.out.println("FINRA");
            } else if (i % 3 == 0) {//numbers that are a multiple of 3,print "FIN"
                System.out.println("FIN");
            } else if (i % 5 == 0) {//numbers that are a multiple of 5, print "RA"
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }
    }
}



