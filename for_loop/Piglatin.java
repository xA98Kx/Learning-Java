import java.util.Scanner;

public class Piglatin {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String word;
        System.out.println("Enter the word");
        word = x.nextLine();
        word = word.toUpperCase();
        int c=word.indexOf('O');
        word = word.substring(c)+word.substring(0,c)+"AY";
        System.out.print(word);

    }
}
