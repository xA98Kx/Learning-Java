import java.util.Scanner;

public class Project_program6 {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to print pattern 1"+"\n"+"2 to print pattern 2");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1: int i,j;
            for(i=2; i<=8; i+=2)
            {
                for(j=i; j<=8; j+=2)
                {
                    System.out.print(j);
                }
                System.out.println();
                
            }
            break;

            case 2: int i1,j1,x;
            for(i1=1;i1<=4;i1++)
            {
                x=65;
                for(j1=1;j1<=i1;j1++)
                {
                    System.out.print((char)x);
                    x+=2;

                }
                System.out.println();
            }
            break;
            default:System.out.println("Incorect choice");
        }
        sc.close();
    }
}
