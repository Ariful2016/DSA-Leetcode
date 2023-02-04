package loops;

import java.util.Arrays;
import java.util.Scanner;

public class TowDArray {
    public static void main(String[] args) {
        System.out.println("Enter 2D_Array...");
        int [][] arr = new int[3][3];

        Scanner i = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = i.nextInt();
            }
        }

        /*for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }*/

        for (int row = 0; row< arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
