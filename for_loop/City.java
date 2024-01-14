import java.util.Scanner;
class City
{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String a[] = new String[5];
        System.out.println("Enter 4 city names");
        for(int i = 0; i<5; i++)
        {
            a[i] = x.nextLine();
        }
        for(int i=0; i<4; i++)
        {
            for(int j = 0; j<4-i; j++)
            {
                if(a[j+1].length() < a[j].length()){
                    String temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }

            
        }
        System.out.println("Sorted ");
        for(int i = 0; i<5; i++)
        {
            System.out.println(a[i]);
        }
        x.close();
    }
}