package Ismail_package;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        //Write a return method that can find the frequency of characters
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String str = "AAABBCDD";

        String frequency = "";

        for (int i = 0; i < str.length();i++ ) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (frequency.contains("" + ch)) {
                continue;
            }
            frequency += ch + "" +count;
        }
        System.out.println(frequency);


    }
}
