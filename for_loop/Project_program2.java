import java.util.Scanner;

public class Project_program2
{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int ch,i,s=0;
        System.out.println("Enter choice, 1 for the sum of the first 20 natural"+ 
        " numbers and 2 to find the sum of the series'a^0-a^1.. n terms'");
        ch = x.nextInt();
        switch(ch)
        {
            case 1:
            x.close();

            for(i=1;i<=20;i++)
            {
                s = s+i;
            }
            System.out.println(s);
            break;

            case 2:
            System.out.println("Enter the number");
            int a = x.nextInt();
            System.out.println("Enter the number of total terms to be iterated");
            int n = x.nextInt();
            x.close();
            for (i=0;i<=n-1;i++)
            {
                s = s + (int)Math.pow(-a,i);
            }
            System.out.println(s);
            break;

            default: System.out.println("Error");
            x.close();
        }
    }
}