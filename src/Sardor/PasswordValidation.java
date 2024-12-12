package Sardor;

public class PasswordValidation {

    public static void main(String[] args) {

        System.out.println(isValidPassword("Password1#"));
    }

    /*
    Password Validation Task:
Write a return method that can verify if a password is valid or not.
Requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. Password should at least contain one upper case letter
    3. Password should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns false
     */

    public static Boolean isValidPassword(String password) {

        if(password.length() < 6|| password.contains(" ")) {
            return false;
        }
        if(password == null) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specialChars = "!@#$%^&*()-+=_";



        char[] chars = password.toCharArray();
        for (char each : chars) {
            if(Character.isUpperCase(each)) {
                hasUpperCase =  true;
            }else if (Character.isLowerCase(each)) {
                hasLowerCase = true;
            }else if (Character.isDigit(each)) {
                hasDigit = true;
            }else if(!Character.isDigit(each) && !Character.isLetter(each)) {
                hasSpecial = true;
            }else if (Character.isDigit(each)) {
                return true;
            }
        }

        if(hasUpperCase&&hasLowerCase&&hasDigit&&hasSpecial){
            return true;
        }

        return false;

    }
}
