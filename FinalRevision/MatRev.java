import java.util.Scanner;

public class MatRev {
    int arr[][], m, n;

    MatRev(int mm, int nn)
    {
        m = mm;
        n = nn;
    }

    void fillarray()
    {
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the array element "+i+","+j+": ");
                arr[i][j] = x.nextInt();
            }
        }
    }
}
