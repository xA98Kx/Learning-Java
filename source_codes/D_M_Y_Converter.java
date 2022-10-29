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

            case 'b': int y, m, d; //input
            int fd;
            System.out.println("Enter the number of Years");
            y = x.nextInt();
            System.out.println("Enter the number of Months");
            m = x.nextInt();
            System.out.println("Enter the number of Days");
            d = x.nextInt();

            fd = y*365 + m*30 + d;
            System.out.println("Total number of days "+fd+" day(s)");
            break;

            default: System.out.println("error");
        }
        x.close();

    }
}