import java.util.Scanner;

public class Project_Program_1
{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int ch;
        double v,ar;
        double a,b,c,s;//sides of the triangle n semiperimeter
        double pi = 3.142857, r, h;

        System.out.println("Enter 1 to  calculate area of triangle and 2 to calculate volume of a cone");
        ch = x.nextInt();

        switch(ch)
        {
            case 1: System.out.println("Enter the sides of the triangle");
            System.out.print("Side 1  ");
            a = x.nextDouble();
            System.out.print("\n"+"Side 2  ");
            b = x.nextDouble();
            System.out.print("\n"+"Side 3  ");
            c = x.nextDouble();

            s = (a+b+c)/2;

            ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));

            System.out.println("Area = "+ar);
            break;

            case 2: System.out.println("Enter the dimensions of the cone");
            System.out.print("Radius: ");
            r = x.nextDouble();
            System.out.print("Height: ");
            h = x.nextDouble();

            v = (pi*r*r*h)/3;

            System.out.println("Volume = "+v);
            break;

            default: System.out.println("Error! Enter choice in terms of 1 or 2");
        }
        x.close();
    }
}