import java.util.Scanner;

public class ArrayONe {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i<10; i++)
        {
            arr[i] = x.nextInt();
        }
        for(int i = 0; i < 10;i++)
        {
            for(int j = 0; j<10-i-1; j++)
            {
                if(arr[j+1]>arr[j])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        for(int i = 0; i<10; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
