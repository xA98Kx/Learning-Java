import java.util.Scanner;

public class PRODDIGI {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,d,p=1;
    
        System.out.println("Enter a num");

        n = x.nextInt();

        while(n>0)
        {
            d = n%10;
            p=p*d;
            n=n/10;
        }
        System.out.println(p);
    }
}
