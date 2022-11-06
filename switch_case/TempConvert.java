import java.util.Scanner;

class TempConvert
{
    public static void main(String[] args) 
    {

        Scanner x = new Scanner(System.in);
        int i;
        double c;
        double f;
        System.out.println("Enter your choice in terms of 1 or 2"+"\n"+"1 to convert degree celcius to degree farenheit"+"\n"+"2 to convert degree farenheit to degree celcius");
        i = x.nextInt();
        switch(i)
        {
            case 1:System.out.println("Enter temperature in degree celcius");
            c = x.nextDouble();
            f = (9*c/5)+32;
            System.out.println(f+" degree farenheit");
            break;

            case 2:System.out.println("Enter temperature in degree farenheit");
            f = x.nextDouble();
            c = ((f - 32)/9)*5;
            System.out.println(c + " degree celcius");
            break;
        }

        x.close();
        
    }
}