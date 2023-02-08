package Leetcode;
//https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,2,0,1};
        int i = findMissingNumber(arr);
        System.out.println(i);
    }
    static int findMissingNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i];
            // for sorting
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        // find missing
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
