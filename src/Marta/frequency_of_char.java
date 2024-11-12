package Marta;

public class frequency_of_char {

//Write a return method that can find the frequency of characters
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


    public static void main(String[] args) {

        String str = "AAABBCDD";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            String ch = str.charAt(i)+"";

            for(int j = 0; j < str.length(); j++) {

                if (ch.equals(str.charAt(j) + "")) {
                    count++;

                }
            }


                if(result.contains(ch)){
                    continue;
                }

                result += ch + count;


        }
        System.out.println(result);

        }


    }




