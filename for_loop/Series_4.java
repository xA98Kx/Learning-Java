import java.util.Scanner;

public class Series_4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long i,n,s = 0;
        System.out.println("Enter the limit");
        n = x.nextLong();
        x.close();
        for (i = 1; i <= n;i++)
        {
         s = s * 10 + 1;
         System.out.print(s + ",");
        }
    }
}
