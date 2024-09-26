package Marta;

public class FIRNA {
/*
Write a function that prints out the numbers from 1 to 30
but for numbers that are a multiple of 3, print "FIN" instead of the number,
 and for numbers that are a multiple of 5, print "RA" instead of the number.
  For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */

    public static void main(String[] args) {
        printFirna();
    }

    public static void printFirna(){

        for(int i = 1; i <= 30; i++){       // For numbers divisible by both 3 and 5
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FIRNA");
            }else if(i % 3 == 0){           // For numbers divisible by 3
                System.out.println("FIN");
            }else if(i % 5 == 0){           // For numbers divisible by 5
                System.out.println("RA");
            }else{                           // For numbers NOT divisible by 3 or 5
                System.out.println(i);
            }
        }
    }


}
