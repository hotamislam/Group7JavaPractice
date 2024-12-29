package Elmira;

public class ArrayFindMinimum {
    /*
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */

    public static int findMin(int[] numbers) {

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            // Compare each element with min and update if it's smaller
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("Minimum number: " + findMin(arr)); // Output: 6
    }

}
