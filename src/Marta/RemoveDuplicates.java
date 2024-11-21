package Marta;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
        System.out.println(removeDuplicates("Ttonnycykks"));
    }

    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String eachChar = "" + str.charAt(i);

            if(!result.toLowerCase().contains(eachChar)){
                result += eachChar;
            }
        }

        return result;
    }
}
