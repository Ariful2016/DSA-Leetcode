package loops;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("Enter number...");
        Scanner n  = new Scanner(System.in);
        int i = n.nextInt();
        while (i > 0){
            int r = i % 10;
            result = result * 10 + r;
            i = i/10;
        }
        System.out.println("Result is: "+ result);
    }


}
