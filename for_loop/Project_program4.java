import java.util.Scanner;

public class Project_program4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number to check its a harshad's number or not");
        int num = x.nextInt();  
        int rem = 0, sum = 0, n;  
          
        //Make a copy of num and store it in variable n  
        n = num;  
          
        //Calculates sum of digits  
        while(num > 0){  
            rem = num%10;  
            sum = sum + rem;  
            num = num/10;  
        }  
          
        //Checks whether number is divisible by sum of digits  
        if(n%sum == 0)  
            System.out.println(n + " is a harshad number");  
        else  
            System.out.println(n + " is not a harshad number");  
        x.close();
    }  
} 