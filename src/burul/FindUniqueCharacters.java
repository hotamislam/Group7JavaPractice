package burul;

public class FindUniqueCharacters {

    public static void main(String[] args) {
        String str= "aaabcccdefff";
        String uniques="";

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                uniques +=ch;
            }

        }

        System.out.println(uniques);
    }
}
