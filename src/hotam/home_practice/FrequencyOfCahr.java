package hotam.home_practice;

public class FrequencyOfCahr {

    public static void main(String[] args) {

        String str = "ABBCCCDDDD";
        String result = "";

            for (int i = 0; i < str.length(); i++) {

                int count = 0;

                String charr = str.charAt(i)+"";

                for (int j = 0; j < str.length(); j++) {
                    if (charr.equals(str.charAt(j)+"")){
                        count++;
                    }
                }
                if (result.contains(charr)){
                    continue;
                }
                result += charr + count;
            }
        System.out.println(result);

    }

}
