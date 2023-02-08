package Leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// google asked
public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        //int i = ;
        System.out.println(findMissingNumbers(arr));
    }
    static List<Integer> findMissingNumbers(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            // sorting
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        // find missing
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j +1){
                ans.add(j+1);
            }
        }
        return ans;

    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;

    }
}
