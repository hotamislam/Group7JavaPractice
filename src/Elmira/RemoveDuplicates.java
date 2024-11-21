package Elmira;

public class RemoveDuplicates {
    public static void main(String[] args) {
//Write a return method that can remove the duplicated values from String
//Ex:  removeDup("AAABBBCCC")  ==> ABC

        System.out.println("result is " + removeDuplicates("AAABBBCCC"));

    }

    public static String removeDuplicates(String str){

        String result ="";// be containing result string

        for (int i = 0; i <str.length(); i++) { //i: index numbers of str

            char each=str.charAt(i);//get each character of the string

 if (!result.contains(""+each)){ // if the string result does not contain the character of string str yet
                result+=each;// then we will add the character to string result
        }// if the character is not contained yet in the new string, then we will add it to the new string
        }
        return result;
    }

}
