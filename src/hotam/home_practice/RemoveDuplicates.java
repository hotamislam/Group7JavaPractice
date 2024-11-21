package hotam.home_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDups(1,1,3,3,3,4,4,4,5,5,5,6,6,6,7,8,1)));
    }

    public static int[] removeDups(int... arr){

        Set<Integer> unique = new LinkedHashSet<>();

        for (int each : arr) {
            unique.add(each);
        }
//
        int[] uniqueArray = new int[unique.size()];
        int index = 0;

        for (int each : unique){
            uniqueArray[index++]= each;
        }
        return uniqueArray;

    }

}
