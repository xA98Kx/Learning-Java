import java.util.Scanner;

public class Smallest3_Buzz
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        int choice;
        System.out.println("Enter your choice"+"\n"+"1 to find the smallest between 3 numbers"+"\n"+"2 to find the inputed number is a buzz number or not");
        choice = x.nextInt();
        switch(choice)
        {
            case 1: int a,b,c,n;
            System.out.println("Enter 3 numbers");
            a = x.nextInt();
            b = x.nextInt();
            c = x.nextInt();
            n = a<(b<c?b:c)?a:(b<c?b:c);
            System.out.println("Smallest number is "+n);
            break;

            case 2: int num;
            String s;
            System.out.println("Enter the number you wanna check its a buzz number or not");
            num = x.nextInt();
            if (num%10 == 7 || num%7 == 0)
            {
                s = "Yes.";
            }
            else
            {
                s = "No.";
            }
            System.out.println("Is the inputted number a buzz number?"+"\n"+s);
            break;
            default:System.out.println("Error");
        }
        x.close();
    }
}
