package StringAndStringBuilder;

import java.util.ArrayList;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        String a = "Arif";
        String b = "Arif";
        //System.out.println(a == b); // refers to same objects -> == comparision operator // true

        //System.out.println(a.equals(b)); // because value is same -> equals is a method

        String aa = new String("Arif");
        String bb = new String("Arif");
        //System.out.println(aa == bb); // refers to the difference object // false

        //System.out.println(aa.equals(bb)); // refers to value

        float pi = 3.1416546f;
        //System.out.printf("Pi value is %.2f", pi);
        //System.out.printf(" Pi value is %.3f", Math.PI);

        //System.out.printf("My name is %s and I am %s", "Arif","cool");

        //System.out.println('a' + 1); // 97+1 = 98
        //System.out.println('a' + 'b'); // 97+98 = 195
        //System.out.println((char) ('a' + 3)); // d
        //System.out.println("a" + 3); // "a" + "3" = a3 // integer converts to Integer that will call toString()

        System.out.println("a"+ new ArrayList<>());

    }

}
