import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int c=0, n, f=0;
        System.out.println("Enter number");
        n = x.nextInt();
        for (c = 0; c <= 10;c++)
        {
            f = n*c;
            System.out.println(n+"*"+c+"="+f);
        }
        x.close();
        
    }
    
}
