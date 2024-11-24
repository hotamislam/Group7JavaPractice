package Sadaf;

public class Finra {
    public static void main(String[] args) {
        finra(30);
    }

    public static void finra(int num){
        // Loop from 1 to 30
        for (int i = 1; i <= num ; i++) {
            if(i % 15 == 0){  // multiples of 3 & 5 or 15
                System.out.println("FINRA");
            }else if(i % 3 == 0) { // multiples of 3
                System.out.println("FIN");
            }else if(i % 5 == 0) { // multiples of 5
                System.out.println("RA");
            }else {
                System.out.println(i);
            }


        }

    }
}