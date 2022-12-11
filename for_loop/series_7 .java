import java.util.Scanner;

class serier_7
{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n, i, s=0;
        System.out.println("Enter number of outputs");
        n = x.nextInt();
        x.close();
        for (i=1;i <= n; i++)
        {
            s = i*i -1;
            System.out.print(s+",");
        }

        
    }
}