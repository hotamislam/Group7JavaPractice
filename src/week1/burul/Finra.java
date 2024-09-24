package week1.burul;

public class Finra {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            boolean divBy3= i%3==0;
            boolean divBy5=i%5==0;
            String result="";

            if (divBy3 && divBy5){
                System.out.println("FINRA");
            }else if (divBy3){
                System.out.println("FIN");
            }else if (divBy5){
                System.out.println("RA");
            }else {
                result = "" + i;
            }
            System.out.println(result + " ");

        }



    }
}
