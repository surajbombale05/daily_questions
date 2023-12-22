// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.

public class TwoSum {
    public static void main(String args[]) {
        int[] arr = { 7, 4, 5, 6, 3 };
        int target = 9;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                 System.out.println("["+i+","+j+"]");
                }

            }
        }
    }
}
