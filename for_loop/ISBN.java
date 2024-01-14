import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long ISBN;
        System.out.println("Enter ISBN");
        ISBN = x.nextLong();
        long c = ISBN;
        int i=0;
        while (c!=0)
        {
            c/=10;
            i++;
        }
        c = ISBN;
        
        if(i==10)
        {
            int a=0;
            long d;
            while(c!=0)
            {
                d = c%10;
                for(i = 10; i>=1; i--)
                {
                    a+=i*(int)d;
                    //System.out.print(a+" ");
                }
                c/=10;
            }
            if(a%11==0)
            {
                System.out.println("Legal ISBN");
            }
            else{
                System.out.print("Illegal ISBN");
            }
        }
        else{
            System.out.println("Illegal ISBN");
        }
        x.close();
    }
}
