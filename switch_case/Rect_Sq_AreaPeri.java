import java.util.Scanner;

class Rect_Sq_AreaPeri
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        int i;
        System.out.println("Enter your choice in terms of 1 or 2"+"\n"+"1 to find the area of a rectangle"+"\n"+"2 to find the area of a square");
        i = x.nextInt();
        switch(i)
        {
            case 1 : int l,b, area;
            System.out.println("Enter Length and breadth respectibely");
            l = x.nextInt();
            b = x.nextInt();
            area = l * b;
            System.out.println("Area " + area);
            break;

            case 2 : int s, sq_area;
            System.out.println("Enter side of the square");
            s = x.nextInt();
            sq_area = s * s;
            System.out.println("Area " + sq_area);
            break;
        }
        x.close();
    }
}