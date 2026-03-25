import java.util.Scanner;

class Perni2 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int in_in = x.nextInt();
        x.close();
        int in = in_in;
        int inin = in_in;
        int s = 0;
        boolean p = false;
        int len = 0;
        while (in != 0) {
            int d = in % 10;
            s += d;
            in /= 10;
        }
        for (int i = 1; i <= (int) Math.sqrt(s); i++) {
            if (s % i == 0) {
                System.out.println();
                len++;
            }
            
        }
        if (len>1) System.out.println("not prime");
        else 
        {
            System.out.println("prime");
            p = true;
        }
        len=0;
        if (p) {
            while (inin != 0) {
                int d = inin % 10;
                len++;
                inin/=10;
                if (d != 0 && d != 1) System.exit(0);
            }
            if (len < 2) System.exit(0);
            System.out.println("YEAHHHHH!");
        } else {
            System.out.println("NAWWWWWH!");
        }
    }
}
