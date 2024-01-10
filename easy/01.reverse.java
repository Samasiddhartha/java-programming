public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseWithStringBuilder(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseWithStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
