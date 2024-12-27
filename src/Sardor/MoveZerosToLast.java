package Sardor;

import java.util.Arrays;

public class MoveZerosToLast {

    public static void main(String[] args) {

        int [] arr = {1,0,3,0,5,9,0,0,11}; // output should be [1,3,5,9,11,0,0,0,0]

        System.out.println(Arrays.toString(zerosToLast(arr)));
    }

    public static int[] zerosToLast(int[] arr) {

        int size = arr.length;// creating size of giving array

        int[] moveZeros = new int[size];// creating new array and fixing size with length of giving array

        for (int i = 0, j = 0; i < arr.length; i++) {
            if(arr[i] > 0) {//checking each num if it is greater than 0 added into new array
                moveZeros[j++] = arr[i];// j helps me to increment after adding the element into new array

            }
        }

        return moveZeros;
    }
}
