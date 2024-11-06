package Elmira;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

       /*
       Write a return method that can find the frequency of characters
       Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
        */


System.out.println("frequencyOfChars = " + frequencyOfChars("AAABBCDD"));
System.out.println("frequencyOfChars2 = " + frequencyOfChars2("AAABBCDD"));


    }

///            ###  First method  ###
    public static String frequencyOfChars(String characters) {
        String frequencyOfChars = "";

for (int j = 0; j < characters.length(); j++) {//picks one character than goes inside loop
                                               // till inside loop done , goes next ch

       char ch = characters.charAt(j);
       int count = 0;//be resets everytime for nex character

            for (int i = 0; i < characters.length(); i++) {
                if (characters.charAt(i) == ch) {//checks how many times ch has appeared in str
                    count++;//and addit to count
                }
            }

            //this condition to avoid duplicates when printing resul :
       if (frequencyOfChars.contains("" + ch)) {// if the character is already included in the result
                continue;// skip that character
            }
       frequencyOfChars += ch + "" + count;
        }
return frequencyOfChars;

    }



///                      ###  Second method ###

    public static String frequencyOfChars2(String characters) {
        String frequencyOfChars = "";
for (String each : characters.split("")) {
//                                                          convert to collection type
     int frequency = Collections.frequency(  Arrays.asList( characters.split("") ), each );
     //frequency() returns the frequency of the specified element in the specified collection

     if(!frequencyOfChars.contains(each)){//if doesnt contain going to add frequency
                frequencyOfChars += each + frequency;
       }
     }

        return frequencyOfChars;
}


    }



