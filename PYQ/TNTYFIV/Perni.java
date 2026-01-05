import java.util.Scanner;

public class Perni
{
    static int num; //to store a binary number
    
    Perni()
    {
        num = 0;
    }
    static void accept()
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a bunary number");
        num = x.nextInt();
        x.close();
        
        int t = num;
        while(t!=0)
        {
            int d = t%10;
            if (d!=0 && d!=1)
            {
                System.out.println("INVALID INPUT");
                System.exit(0);
            }
            t = t/10;
        }
    }

    static int countOne(int k)
    {
    
        if(k==0) return 0;
        return (k%10)+countOne(k/10);
        
        // if(k==0) return 0;
        // return (k%10 == 1?1:0) + countOne(k/10);
    }
    
    static void check()
    {
        int c = countOne(num);
        if (c%2!=0) System.out.println("Perni Number");
        else System.out.println("Not Perni Number");
    }

    public static void main(String[] args)
    {
        Perni ob = new Perni();
        Perni.accept();
        Perni.check();
    }
}