public class Colsum {
    int mat[][] , m , n;
    Colsum(int mm, int nn)
    {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }
    void readArray()
    {
        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++) {
                System.out.print("Enter element for "+i+"th row and "+j+"th column:");
                mat[i][j] = x.nextInt;
                
                
            }    
        }

    }
}
