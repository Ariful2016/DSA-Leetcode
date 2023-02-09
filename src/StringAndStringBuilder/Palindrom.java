package StringAndStringBuilder;

public class Palindrom {
    public static void main(String[] args) {

        String s = "abcdcba";
        boolean ans = checkPalindrom(s);
        System.out.println(ans);
    }
    static boolean checkPalindrom(String s){
        s = s.toLowerCase();
        if (s == null || s.length() == 0){
            return true;
        }
        for (int i = 0; i <= s.length()/2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);
            if (start != end){
                return false;
            }
        }
        return true;

    }
}
