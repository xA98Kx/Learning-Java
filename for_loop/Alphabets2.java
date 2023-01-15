public class Alphabets2 {
    public static void main(String[] args) {
        int i,j;
        for (i=68; i>=65; i--)
        {
            for (j=65; j<=i; j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
