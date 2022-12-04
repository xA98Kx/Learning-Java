import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = x.nextInt();

        for ( int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                System.out.print(i+",");
            }
        }
        x.close();
    }
    
}
