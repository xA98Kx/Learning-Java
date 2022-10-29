import java.util.Scanner;

public class Resistance_Calculator
{
    public static void main(String[] args)
    {
        
        Scanner x = new Scanner(System.in);
        char choice;
        double r1, r2;
        System.out.println("Enter r1");// input
        r1 = x.nextDouble();// input
        System.out.println("Enter r2");// input
        r2 = x.nextDouble();// input
        System.out.println("Enter your choice"+"\n"+"a for calculating resistance in a series circuit"+"\n"+"b for calculating resistance in a parallel circuit");
        choice = x.next().charAt(0);// input

        switch(choice)
        {
            case 'a': double R1;//storage var
            R1 = r1 + r2; //process
            System.out.println("Resistance of a circuit in series would be " + R1);//output
            break;

            case 'b': double R2;//storage var
            R2 = (r1 * r2)/(r1 + r2); //process
            System.out.println("Resistance in a circuit in parallel connection would be " + R2);//output
            break;

            default:System.out.println("Error, enter choice in terms or a or b");
        }
        x.close();
    }
}