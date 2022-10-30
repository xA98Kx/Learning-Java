import java.util.Scanner;

public class Sum_or_compare
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        int choice, num_1, num_2;
        System.out.println("Enter number 1");
        num_1 = x.nextInt();
        System.out.println("Enter number 2");
        num_2 = x.nextInt();
        System.out.println("Enter your choice"+"\n"+"1 to find the sum of 2 numbers"+"\n"+"2 to find which is greater amongst the 2 numbers");
        choice = x.nextInt(); 
        switch(choice)
        {
            case 1:int numstr1;
            numstr1 = num_1 + num_2;
            System.out.println("The sum of 2 numbers "+numstr1);
            break;
            case 2:int numstr_2;
            numstr_2 = num_1>num_2?num_1:num_2;
            System.out.println("The greater number is "+numstr_2);
            
            default: System.out.println("Error");
        }
        x.close();
    }
}
