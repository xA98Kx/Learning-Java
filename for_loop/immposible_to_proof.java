/*Programs that works on 3n+1 formula
 * n = a number
 * multiplied by 3 when its odd
 * and divided by 2 when even
 * the only question is do they all end in 4,2,1?
 * go ahead and try yourself! this uses long so u can try quite a bit of numbers
 */

import java.util.Scanner;

public class immposible_to_proof {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        long n;
        System.out.println("Enter your number");
        n = x.nextLong();
        x.close();
        for(;;)
        {

            if (n==0) break;
            else if (n==1) break;
            else{
                if (n%2 == 0) n/=2;
                else n=3*n+1;
            }
            System.out.println(n);

        }
    }
}
