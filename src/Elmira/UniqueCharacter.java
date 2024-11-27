package Elmira;

public class UniqueCharacter {

   // Write a return  method that can find the unique characters from the String
   // Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
   public static void main(String[] args) {
       System.out.println("uniqueChars = " + unique("AAABBBCCCDEF"));
   }

    public static String unique(String str){
     String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)){
                uniqueChars += currentChar;
            }
        }
     return uniqueChars;
    }
}
