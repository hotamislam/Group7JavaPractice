package Sardor;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("AABBBCCC"));

    }
    public static String removeDuplicates(String str) {

        String result = "";//"AAABBBCCC"
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!result.contains(ch + "")) {
                result += ch + "";
            }
        }
        return result;
    }
}
