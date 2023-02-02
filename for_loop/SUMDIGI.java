import java.util.Scanner;

public class SUMDIGI {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,d,s=0;
    
        System.out.println("Enter a num");

        n = x.nextInt();

        while(n>0)
        {
            d = n%10;
            s=s+d;
            n=n/10;
        }
        System.out.println(s);
    }
}
