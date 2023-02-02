import java.util.Scanner;

public class REV {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,d,r=0;
    
        System.out.println("Enter a num");

        n = x.nextInt();

        while(n!=0)
        {
            d = n%10;
            r = r*10+d;
            n=n/10;
        }
        System.out.println(r);
    }
}
