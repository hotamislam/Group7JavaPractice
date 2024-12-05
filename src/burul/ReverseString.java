package burul;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("reverseStrings(\"Burul\") = " + reverseStrings("Burul"));
    }

    public static String reverseStrings(String str){

        String reverse="";//this variable will store string in reverse order

        for (int i = str.length() - 1; i >= 0; i--) {
        //i: index numbers of the given string starting from last index to index 0

            reverse += str.charAt(i);/* to get each characters of the string and
             add them to the reverse*/
        }
        return reverse;//will return given string in reverse order
    }
    }

