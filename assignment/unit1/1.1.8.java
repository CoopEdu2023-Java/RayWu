package unit1;

class Main {
    public static void main(String[] args) {
        System.out.println(insertString("123", new String[] {"a", "b", "c"}));  // Outputs: "a123b123c"
    }

    public static String insertString(String str, String[] arr) {
        String result = "";
        for (String s : arr) {
            result += s + str;
        }
        return result;
    }
}