import java.util.Scanner;

public class Program22 {
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }   
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
    }
}