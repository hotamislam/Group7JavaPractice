package Marta;

import java.util.HashSet;
import java.util.Set;

public class FindUnique {
    public static void main(String[] args) {
        /*
        Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
         */
         



         
    }
    
    public static String findUniqueChars(String str){
        
        String result = ""; //to hold unique characters
        
        for (int i = 0; i < str.length(); i++) {
            
            int count = 0;
            
            for(int j = 0; j < str.length(); j++){ //compare one element with each element from str
                if(str.charAt(i) == str.charAt(j)){
                    count++; //increase count if elements are the same
                }
                
            }
            
            if(count == 1){
                result += str.charAt(i);
            }
            
        }
    
    
        return result;
    }




}
