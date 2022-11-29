import java.util.Scanner;


public class electricityBill {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int units;
        double cost;
        System.out.println("Enter units");
        units = x.nextInt();

        if (units <= 100)  cost = units * 0.15;
        else if (units > 100 && units <=250) cost = 100 * 0.15 + (units - 100) * 1.50;
        else if (units > 250 && units <=600) cost = 100 * 0.15 + 150 * 1.5 + (units - 250) * 3.5;
        else    cost = 100 * 0.15 + 150 * 1.5 + 350 * 3.5 + (units - 600) * 5.8;
        cost += 200;
        System.out.println("Billled amount(aprrox)  "+cost);
        x.close();

    }
    
}
