import java.util.Scanner;

public class duck {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n,d,f=0;
        x.close();
        System.out.println("Enter a num");

        n = x.nextInt();

        while(n>0)
        {
            d = n%10;
            if (d==0)
            {
                f=1;
            }
            n=n/10;
        }
        if (f==1) 
        {
            System.out.println("Duck num");
        }
        else
        {
            System.out.println("Not a duck number");
        }
    }
}
