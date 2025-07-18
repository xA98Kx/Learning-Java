import java.util.Scanner;

public class Program21 {
    static void recurringPrint(String s, int length, int n) {
        if (s.length() != 0) {
            System.out.println(s);
            recurringPrint(s.substring(0, length - n - 1), length, n + 1);
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a String to be printed out in a pattern");
        String in = x.nextLine();
        System.out.println("The final pattern is \n");
        recurringPrint(in, in.length(), 0);
    }
}
