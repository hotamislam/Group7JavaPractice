package week2.home_practice;

public class FINRA {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if(i%3==0){
                System.out.println("Fin"+i);
            } else if(i%5==0) {
                System.out.println("Ra"+i);
            }else if(i%3==0||i%5==0){
                System.out.println("Finra"+i);
            }else{
                System.out.println(""+i);
            }

        }

}}
