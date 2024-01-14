import java.util.Scanner;

public class Project_program3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int i,n,f=0;
        System.out.println("Enter a numer to check whether its prime or composites");
        n = x.nextInt();
        x.close();

        for (i=2;i<=n/2;i++) if (n%i==0) f+=1;
        if (f==0) System.out.println("Prime");
        else System.out.println("Composite");
       
    }
}
