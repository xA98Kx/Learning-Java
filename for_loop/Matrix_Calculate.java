public class Matrix_Calculate {
    public static void main(String[] args) {
        int M[][] = {{-1,0,2},{-3,-1,6},{4,3,-1}};
        int S[][] = {{-6,9,4},{4,5,0},{1,-2,-3}};
        int N[][] = new int[3][3];

        for(int i = 0; i<3; i++)
        {
            for(int j = 0 ; j<3; j++)
            {
                N[i][j] = S[i][j] - M[i][j];
            }
        }
        for(int i = 0; i<3; i++)
        {
            for(int j = 0 ; j<3; j++)
            {
                System.out.print(N[i][j]+" ");
            }
            System.out.println();
        }
    }
}
