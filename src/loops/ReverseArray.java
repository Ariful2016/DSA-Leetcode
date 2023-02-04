package loops;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {7,2,3,4,5,1,9};
        int start = 0;
        int end = arr.length - 1;
        /*while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));*/

        int max = arr[0];
        int s_max = arr[1];
        for (int i =1; i< arr.length; i++){
            if (arr[i] > max){
                s_max = max;
                max = arr[i];
            }else if (arr[i] > s_max && arr[i] != max){
                s_max = arr[i];
            }
        }
       /* for (int i =1; i< arr.length; i++){
            if ( arr[i] > s_max && arr[i] != max){
                s_max = arr[i];
            }
        }*/
        System.out.println(max);
        System.out.println(s_max);
    }
}
