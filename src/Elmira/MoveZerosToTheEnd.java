package Elmira;

public class MoveZerosToTheEnd {
/*
    Write a method that can move all the zeros to the last indexes of the array
    (Do Not Use the Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]

 */


    public static void main(String[] args) {

        int[] input = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(input);
        System.out.println(java.util.Arrays.toString(input));

        //               or

        for (int num : input) {
            System.out.print(num + " ");
        }




    }



    public static void moveZerosToEnd(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[result++] = arr[i]; // Move non-zero elements to the front
            }
        }

        // Fill the remaining positions with zeros
        while (result < arr.length) {
            arr[result++] = 0;
        }
    }




}
