
import java.util.Scanner;

public class Colsum2 {

    int mat[][], m, n;

    public Colsum2(int mm, int nn) {
        m = mm;
        n = nn;

    }

    void readArray()
    {
        mat = new int[m][n];
        Scanner x = new Scanner(System.in);
        System.out.println("Enter array elements for MATRIX "+((int)(100*Math.random())));
        for(int i=0; i<m; i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j] = x.nextInt();
            }
        }

        x.close();
    }

    boolean check (Colsum2 A, Colsum2 B)
    {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<n; i++)
        {
            sum1=0;
            sum2=0;

            for(int j=0; j<m; j++)
            {
                sum1 += A.mat[j][i];
                sum2 += B.mat[j][i];
            }

            if (sum1==sum2) continue;
            else return false;
        }
        

        return true;
    }

    void print()
    {
        // FIRST
        System.out.println("---------- MATRIX "+(int)(100*Math.random())+"----------");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the rows and column for ");
        int in=x.nextInt();
        int im=x.nextInt();

        Colsum2 C1 = new Colsum2(in, im);
        Colsum2 C2 = new Colsum2(in, im);

        C1.readArray();
        C2.readArray();

        System.out.println("========================Array print========================");
        C1.print();
        C2.print();

        C1.check(C1,C2);

        x.close();
    }
}
