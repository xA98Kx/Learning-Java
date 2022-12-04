import java.util.Scanner;

public class Series_3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        double n, i;
        System.out.println("Enter the limit");
        n = c.nextDouble();
        c.close();

        for( i = 0; i <= n; i++)
        {
            System.out.print((int)Math.pow(3, i)+",");
        }


    }
}


