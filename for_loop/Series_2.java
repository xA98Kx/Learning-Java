import java.util.Scanner;

public class Series_2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double n, i;
        System.out.println("enter the limit");
        n = x.nextDouble();
        x.close();
        for (i =1; i <= n; i++)
        {
            System.out.print((int)Math.pow(i, 2)+",");
        }
    }
}
