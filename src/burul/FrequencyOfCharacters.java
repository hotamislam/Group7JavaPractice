package burul;

public class FrequencyOfCharacters {

        public static void main(String[] args) {
            String str="AAABBCDD";

            String result="";// A3B2C1D2


            //OUTER LOOP:Iterates inner loop
            for(int j=0;j<str.length();j++){/*outer loop will cause
            to loop inner loop to repeat */

                char ch=str.charAt(j);//to get the 1st character of the string

                //FREQUENCY OF CHARACTERS
                int count=0;//this variable gets the frequency (count) of each character


                //INNER LOOP: Goes through all the characters
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i)==ch) {//if each character of the string equals to each character
                        count++;//increase it by 1
                    }
                }

                //IF STATEMENT => TO AVOID DUPLICATION
                if (result.contains(ch +"")){/* if the character is already included in
        the result */
                    continue;//then skip it
            /*This if statement added to avoid the duplication of
            the characters
            */
                }
                result +=ch+"" +count;
            }
            System.out.println(result);





        }
    /*
    this above program will be used to find all the character's frequency
    from any string
     */

    }


