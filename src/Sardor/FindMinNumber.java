package Sardor;

public class FindMinNumber {

    public static void main(String[] args) {

        int[] nums = {10,2,9,1,4,24,55};
        System.out.println(findMinNumber(nums));//output should be 1
    }

    public static int findMinNumber(int[] nums) {

        int minNum = nums[0]; //setting the first number as minNum by default;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < minNum) {
                minNum = nums[i];
            }
        }

        return minNum;

    }
}
