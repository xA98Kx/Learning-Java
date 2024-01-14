import java.util.Scanner;

public class ClassTeacher {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String name[] = new String[5],s="";
        int marks[][] = new int[5][5],si=0,c=0;
        for(int i=0; i<5; i++)
        {
            name[i]  = x.nextLine();
        }
        System.out.println("Enter marks in this order: English,Maths,Physics,Chemistry,Computer");
        for(int i=0; i<5; i++)
        {
            for(int j =0;j<5;j++)
            {
                marks[i][j] = x.nextInt();
            }
        }
        System.out.print("Enter the student name: ");
        s = x.nextLine();
        for(int i =0; i<5; i++)
        {
            if(name[i].equalsIgnoreCase(s)){
                si=i;
                c++;
                break;
            }
        }
        if(c==1)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println(marks[si][j]);
            }
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
