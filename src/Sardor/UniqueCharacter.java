package Sardor;

public class UniqueCharacter {

    public static void main(String[] args) {

        System.out.println("uniqueElements(\"AAABBBCCDEF\") = " + uniqueElements("AAABBBCCDEF"));
    }

    public static String uniqueElements(String str) {
        //AAABBBCCDEF;
        String unique = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                unique += ch;
            }

        }





        return unique;
    }
}
