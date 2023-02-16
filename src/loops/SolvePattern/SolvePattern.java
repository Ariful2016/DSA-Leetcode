package loops.SolvePattern;

public class SolvePattern {
    public static void main(String[] args) {
          pattern12(5);
    }
         /*
            * * * * *
            * * * * *
            * * * * *
            * * * * *
            * * * * *
            */

    static void pattern1(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            // print new line
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    static void pattern2(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            // print new line
            System.out.println();
        }
    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    static void pattern3(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop
            for (int j = 1; j <=n+1-i; j++) {
                System.out.print("* ");
            }
            // print new line
            System.out.println();
        }
    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    static void pattern4(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            // print new line
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    static void pattern5(int n){
        // outer loop
        for (int i = 1; i <= 2 * n ; i++) {
            //// calculate numbers of column
            int c = i > n  ? 2 * n - i : i;
            // inner loop
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            // print new line
            System.out.println();
        }
    }

    /*
             *
           * *
         * * *
       * * * *
     * * * * *
     */
    static void pattern6(int n){
        for (int i = 0; i < n; i++) {
            int c =  n - i;
            for (int s = 1; s < c; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * * *
       * * * *
         * * *
           * *
             *
     */

    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            int c =  n - i;
            for (int s = i; s >= 0; s--) {
                System.out.print("  ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
         *
        ***
       *****
      *******
     *********
     */

    static void pattern8(int n){

            for (int i = 1; i <= 2 * n ; i+=2) {

                // calculate numbers of column
                //int c = i > n  ? 2 * n - i : i;

                // calculate space of every column
                int space = n - i;
                for (int s = 0; s <= space ; s+=2) {
                    System.out.print(" ");
                }

                // inner loop
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // print new line
                System.out.println();
            }

    }

    /*
     *********
      *******
       *****
        ***
         *
     */
    static void pattern9(int n){

        for (int i = 1; i <= 2 * n ; i+=2) {

            // calculate numbers of column
            //int c = i > n  ? 2 * n - i : i;

            // calculate space of every column
            int space = n - i;
            for (int s = 0; s >= space ; s-=2) {
                System.out.print(" ");
            }

            // inner loop
            for (int j = 2*n; j>i; j--) {
                System.out.print("*");
            }
            // print new line
            System.out.println();
        }

    }

    /*
         *
        * *
       * * *
      * * * *
     * * * * *

     */

    static void pattern10(int n){

        for (int i = 1; i <= n ; i++) {

            // calculate numbers of column
            //int c = i > n  ? 2 * n - i : i;

            // calculate space of every column
            int space = n - i;
            for (int s = 0; s <= space ; s++) {
                System.out.print(" ");
            }

            // inner loop
            for (int j = i; j>=1; j--) {
                System.out.print("* ");
            }
            // print new line
            System.out.println();
        }

    }

    /*
     * * * * *
      * * * *
       * * *
        * *
         *

     */

    static void pattern11(int n){

        for (int i = 1; i <= n ; i++) {

            // calculate numbers of column
            //int c = i > n  ? 2 * n - i : i;

            // calculate space of every column
            //int space = n - i;
            for (int s = i; s >= 1; s--) {
                System.out.print(" ");
            }

            // inner loop
            for (int j = n; j>=i; j--) {
                System.out.print("* ");
            }
            // print new line
            System.out.println();
        }

    }

    static void pattern12(int n){
        for (int i = 1; i <= 2*n; i++) {
            // calculate numbers of column
            int c = i > n  ? 2 * n - i : i;

            // calculate space of every column
            int space = n - c;
            for (int s = c; s >= 1 ; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    /*
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
     */

    static void pattern28(int n){
        // outer loop
        for (int i = 1; i <= 2 * n ; i++) {

            // calculate numbers of column
            int c = i > n  ? 2 * n - i : i;

            // calculate space of every column
            int space = n - c;
            for (int s = 0; s <= space ; s++) {
                System.out.print(" ");
            }

            // inner loop
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            // print new line
            System.out.println();
        }
    }

    /*
          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5

     */
    static void pattern30(int n){
        // outer loop
        for (int i = 1; i <= n ; i++) {

            // calculate space of every column
            int space = n - i;
            for (int s = 0; s <= space ; s++) {
                System.out.print("  ");
            }

            // inner loop for left side
            for (int col = i; col >= 1; col--) {
                System.out.print(col+" ");
            }
            // inner loop for right side
            for (int col = 2; col <= i ; col++) {
                System.out.print(col+" ");
            }
            // print new line
            System.out.println();
        }
    }

    /*
          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
    4 3 2 1 2 3 4
      3 2 1 2 3
        2 1 2
          1

     */
    static void pattern17(int n){
        // outer loop
        for (int i = 1; i <= 2 * n ; i++) {

            // calculate space of every rows
            int c = i > n ? 2 * n - i : i;

            // calculate space of every column
            int space = n - c;
            for (int s = 1; s <= space ; s++) {
                System.out.print("  ");
            }

            // inner loop for left side
            for (int col = c; col >= 1; col--) {
                System.out.print(col+" ");
            }
            // inner loop for right side
            for (int col = 2; col <= c ; col++) {
                System.out.print(col+" ");
            }
            // print new line
            System.out.println();
        }
    }

    /*
0 0 0 0 0 0 0 0 0
0 1 1 1 1 1 1 1 0
0 1 2 2 2 2 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 3 4 3 2 1 0
0 1 2 3 3 3 2 1 0
0 1 2 2 2 2 2 1 0
0 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0

     */
    static void pattern32(int n){
        n = 2 * n;
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = Math.min(Math.min(i,j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    /*
    4 4 4 4 4 4 4 4 4
    4 3 3 3 3 3 3 3 4
    4 3 2 2 2 2 2 3 4
    4 3 2 1 1 1 2 3 4
    4 3 2 1 0 1 2 3 4
    4 3 2 1 1 1 2 3 4
    4 3 2 2 2 2 2 3 4
    4 3 3 3 3 3 3 3 4
    4 4 4 4 4 4 4 4 4
     */
    static void pattern31(int n){
        int originalN = n;
        n = 2 * n;
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = originalN - Math.min(Math.min(i,j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }





}
