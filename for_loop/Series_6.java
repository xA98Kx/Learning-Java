import java.util.Scanner;

public class Series_6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        long n,i,s=0;
        System.out.println("Enter the limit");
        n = x.nextLong();
        x.close();

        for (i=1; i<=n; i++)
        {
            s = s * 10 + i;
            System.out.println(s+",");
        }
    }
}
