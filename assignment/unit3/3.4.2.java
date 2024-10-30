import java.util.Arrays;

class CheckAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
    public static void main(String[] args) {
        CheckAnagram obj = new CheckAnagram();
        System.out.println(obj.isAnagram("anagram", "nagaram"));
    }
}