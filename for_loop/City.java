import java.util.Scanner;
class City
{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String a[] = new String[5];
        for(int i = 0; i<5; i++)
        {
            a[i] = x.nextLine();
        }
        for(int i=0; i<4; i++)
        {
            if(a[i+1].length() < a[i].length()){
                String temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }

        }
        for(int i = 0; i<5; i++)
        {
            System.out.println(a[i]);
        }
    }
}