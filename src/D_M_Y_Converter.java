import java.util.Scanner;

public class D_M_Y_Converter
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        char choice;
        System.out.println("Enter your choice"+"\n"+"a for converting Days into year(s), month(s) and day(s)"+"\n"+"b for converting year,months and days into days");
        choice = x.next().charAt(0);
        switch(choice)
        {
            case 'a': int days; // input
            int months, years, remaining_days; //output
            System.out.println("Enter the number of days");
            days = x.nextInt();
            years = days/365;
            remaining_days = days%365;
            months = remaining_days/30;
            remaining_days = remaining_days%30;
            System.out.println("Days "+remaining_days+" Months "+months+" Years "+years);
            break;

            case 'b': int years, months, days;
            int days;
            System.out.println("Enter the number of years");

            default: System.out.println("error");
        }


    }
}