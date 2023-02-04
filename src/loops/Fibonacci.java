package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a= 0;
        int b= 1;
        int count = 2;
        System.out.println("Enter n'th number... ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(count <= n){
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
