package loops;

import java.util.Scanner;

public class CountDuplicateNumber {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter number...");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Which number you want to check...");
        int i = input.nextInt();
        while (n > 0){
            int remainder = n % 10;
            if (remainder == i){
                count++;
            }
            n = n /10;
        }
        System.out.println("Result is: "+ count);

    }
}
