import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Recursion {


    static final char [] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
     'G', 'H', 'I', 'J' , 'K', 'L', 'M', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    final int MAX_BASE = 36;
    static int t = 0;
    static int a,b,c,limit;
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int ch;
        printMenu();
        ch = x.nextInt();
        switch (ch) {
            case 0:
            System.out.println("Exiting...");
            System.exit(0);
            break;
            
            
            case 1:
            System.out.print(Colors.BLUE);
            System.out.println("Input the base");
            int m = x.nextInt();
            System.out.println("Input the exponent");
            int n = x.nextInt();
            System.out.print(Colors.RESET);
            System.out.print(Colors.GREEN);
            System.out.println(power(m, n));
            break;
            
            
            case 2:
            System.out.print(Colors.BLUE);
            System.out.println("Enter the limit");
            int l = x.nextInt();
            System.out.print(Colors.RESET);
            System.out.print(Colors.GREEN);
            System.out.println(sum(l));
            break;
            case 3:
            System.out.print(Colors.BLUE);
            System.out.println("Enter the two numbers");
            int n1 = x.nextInt();
            int n2 = x.nextInt();
            System.out.print(Colors.RESET);
            System.out.print(Colors.GREEN);
            System.out.println(hcf(n1, n2));
            break;
            case 4:
            System.out.println(Colors.BLUE+"Enter the number");
            System.out.print(Colors.RESET);
            int n3 = x.nextInt();
            System.out.println(Colors.GREEN + factorial(n3));
            break;

            case 5:
            System.out.println("this shit broken");
            //int lm = x.nextInt();
            // System.out.println(fibbonacci(lm));
            break;

            case 6:
                System.out.println(Colors.BLUE + "Enter the number of elements in the array");
                int ar_lim = x.nextInt();
                int arr[] = new int[ar_lim];
                System.out.println(Colors.BOLD + "-=-=-=-=-==-=-=-=   ARRAY INPUT   =-=-=-=-=-=-=-=-=-=-");
                System.out.print(Colors.RESET+Colors.PURPLE);
                for(int i = 0; i<ar_lim; i++)
                {
                    System.out.print("Enter array element for position number "+(i+1)+": ");
                    arr[i] = x.nextInt();
                }
                sort(arr, ar_lim);
                for(int i = 0; i<ar_lim; i++)
                {
                    System.out.print(arr[i]+",");
                }
                System.out.println(Colors.YELLOW+"Enter the search element");
                int ele = x.nextInt();

                if(binSearch(arr, ele, ar_lim-1, 0)!=-1) System.out.println(Colors.GREEN+Colors.BOLD+"    FOUND !!!!!");
                else
                    System.out.println(Colors.RED+Colors.BOLD+" NOT FOUND !!!!!!!");


            
            break;

            case 7:
                System.out.println(Colors.BOLD+Colors.BLUE+"Enter the number");
                int num = x.nextInt();
                System.out.println(Colors.YELLOW+"Enter the base to which you want to convert this number into");
                int base = x.nextInt();

                base = (base<0)?-base:base;

                printBase(num, base);
            
            break;

            case 8:
                System.out.print("Enter a number to reverse");
                int n5 = x.nextInt();
                System.out.println(printReverse(n5));
                break;
            
                case 9:
                    System.out.println("Enter number");
                    int n6 = x.nextInt();
                    int sum = armstrongSum(n6);
                    if(sum==n6) System.out.println("YAY");
                    else System.out.println("NAY");
                    break;
            default:
            System.out.println("Wrong Input!");
            break;
        }
    }
    public static void printMenu() {
        System.out.print(Colors.CYAN);
        System.out.println("\n====================================");
        System.out.println("               RECURSION              ");
        System.out.println("====================================");
        System.out.println(" 1. Power m^n");
        System.out.println(" 2. Sum upto n");
        System.out.println(" 3. HCF m,n");
        System.out.println(" 4. Factorial n");
        System.out.println(" 5. Fibonacci n  -- broken ");
        System.out.println(" 6. Binary Search n");
        System.out.println(" 7. Decimal to Binary");
        System.out.println(" 8. Reverse number\n 9. Armstrong");
        System.out.println(" 0. Exit");

        System.out.println("====================================");
        System.out.println(Colors.RESET);
    }
    
    static int power(int m, int n)
    {
        if (n==0) return 1;
        return (m*power(m, n-1));
        
    }
    
    static int sum(int n)
    {
        if (n==0) return 0;
        return (++t+sum(n-1));
    }
    
    static int hcf(int p, int q)
    {
        if (q==0) return p;
        return hcf(q, p%q);
    }
    
    static int factorial(int n)
    {
        if(n<2) return 1;
        return n*factorial(n-1);
    }
    
    // static void printFibonacciSeries(int terms)
    // {
    //     for (int i = 0; i < terms; i++)
    //         {
    //         System.out.print(fibonacci(i) + " ");
    //     }
    //     System.out.println();
    // }
    static int[] sort(int []a, int n)
    {
        int t;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        return a;
    }
    static int binSearch(int [] a, int x, int high, int low)
    {
        if(low>high) return -1;
        int mid = (low+high)/2;

        if       (a[mid] > x)
            return binSearch(a,x,mid-1,low);
        else if  (a[mid] < x)
            return binSearch(a, x, high, mid+1);
        else
            return 67;
    }


    /**
     * HARDEST SHIT EVER IG (NOT REALLY)
     * CONVERTING ANY BASE TO ANY BASE?
     * WHY? COZ I SAID SO
    */

    static void printBase(int num, int base)
    {
        if (num >= base) printBase(num/base, base); 
        System.out.print(Colors.GREEN+""+DIGITS[num%base]);
    }

    static int printReverse(int n)
    {
        if(n<10) return n;
        else{
            int d = n%10;
            return (d*10+printReverse(n/10));
        }
    }

    static int armstrongSum(int n)
    {
        if(n<10) return n*n*n;
        int d = n%10;
        return (d*d*d + armstrongSum(n/10));
    }

}

