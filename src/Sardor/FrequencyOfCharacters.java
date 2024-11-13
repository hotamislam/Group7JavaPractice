package Sardor;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCD";
        System.out.println(getFrequencyOfChar(str));
    }

    private static String getFrequencyOfChar(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if(ch == str.charAt(j)) {
                    count++;
                }
            }
            if(!result.contains(ch + "")){
                result += ch + "" + count + ",";
            }
        }
        return result;


    }
}
