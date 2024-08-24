package unit1;
class efg {
    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
    public static boolean palindrome(String str) {
        return str.equals(reverse(str));
    }
    public static void main(String[] args) {
        System.out.println(palindrome("123454321"));
    }
}