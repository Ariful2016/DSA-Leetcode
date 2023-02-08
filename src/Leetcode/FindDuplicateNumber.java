package Leetcode;
//https://leetcode.com/problems/find-the-duplicate-number/
// amazon asked
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,5,6,4,1};
        System.out.println(duplicateNumber2(arr));
    }
    // solution 1
    static int duplicateNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1){
                return arr[j];
            }
        }
        return arr.length;
    }
    // solution 2
    static int duplicateNumber2(int[] arr){
        int i = 0;
        if (arr[i] != i+1){
            while (i < arr.length){
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }else {
                    return arr[i];
                }
            }
        }else {
            i++;
        }

        return -1;
    }
    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
