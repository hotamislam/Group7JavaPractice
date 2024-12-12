package Elmira;

public class PasswordValidationTask {
//
//    Password Validation Task:
//    Write a return method that can verify if a password is valid or not.
//    Requirements:
//    1. Password MUST be at least have 6 characters and should not contain space
//    2. Password should at least contain one upper case letter
//    3. Password should at least contain one lowercase letter
//    4. Password should at least contain one special characters
//    5. Password should at least contain a digit
//    if all requirements above are met, the method returns true, otherwise returns false



        public static boolean isValidPassword(String password) {
     // MUST be at least have 6 characters and should not contain space
            if (password == null || password.length() < 6) {
                return false;
            }

            if (password.contains(" ")) {//checking if contains space
                return false;
            }

     // Flags to ensure all conditions are met
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;

            // Special characters string
            String specialChars = "!@#$%^&*()-+";

            // Loop through each character in the password
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (specialChars.contains(String.valueOf(c))) {
                    hasSpecialChar = true;
                }

                // If all conditions are met, no need to check further
                if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
                    return true;
                }
            }

            // If any of the conditions is not met, return false
            return false;
        }

        /*

Input: "Passw1!"

Character P:
    Character.isUpperCase(P) → true, so hasUpperCase = true.
    Skips the rest of the else if checks for this character.
    Moves to the next character.

Character a:
    Character.isUpperCase(a) → false.
    Character.isLowerCase(a) → true, so hasLowerCase = true.
    Skips the remaining else if checks for this character.
    Moves to the next character.

Character 1:
    Character.isUpperCase(1) → false.
    Character.isLowerCase(1) → false.
    Character.isDigit(1) → true, so hasDigit = true.
    Skips the remaining else if checks for this character.
    Moves to the next character.

Character !:
    Character.isUpperCase(!) → false.
    Character.isLowerCase(!) → false.
    Character.isDigit(!) → false.
    specialChars.contains(!) → true, so hasSpecialChar = true.
    Skips the remaining else if checks for this character.

At this point, all flags (hasUpperCase, hasLowerCase, hasDigit, hasSpecialChar) are true. The loop exits early.
         */

        public static void main(String[] args) {
            // Test cases
            System.out.println(isValidPassword("Passw1!")); // true

            System.out.println(isValidPassword("pass")); // false
            System.out.println(isValidPassword("PASSWORD")); // false
            System.out.println(isValidPassword("Password")); // false
            System.out.println(isValidPassword("P@ssword1")); // true
            System.out.println(isValidPassword("P@ss 1")); // false
        }
    }









