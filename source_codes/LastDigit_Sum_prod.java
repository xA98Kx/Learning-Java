import java.util.Scanner;

public class LastDigit_Sum_prod
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        int choice, a , b;
        System.out.println("Enter 2 numbers");
        a = x.nextInt();
        b = x.nextInt();
        System.out.println("Enter your choice"+"\n"+"1 to find the product of the last digits"+"\n"+"2 to find the sum of the last digits");
        choice = x.nextInt();

        switch(choice)
        {
            case 1:int p;
            p = a%10 * b%10;
            System.out.println("The product of the last digits "+p);
            break;

            case 2:int s;
            s = a%10 + b%10;
            System.out.println("The sum of the last digits "+s);
            break;

            default:System.out.println("Error.");
        }
        x.close();
    }
}