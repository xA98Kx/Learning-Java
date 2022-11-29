

import java.util.Scanner;

class taxi_metre
{
    static String getAlphaNumericString(int n)
    {
    
     // chose a Character random from this String
     String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "abcdefghijklmnopqrstuvxyz";
    
     // create StringBuffer size of AlphaNumericString
     StringBuilder sb = new StringBuilder(n);
    
     for (int i = 0; i < n; i++) {
    
      // generate a random number between
      // 0 to AlphaNumericString variable length
      int index
       = (int)(AlphaNumericString.length()
         * Math.random());
    
      // add Character one by one in end of sb
      sb.append(AlphaNumericString
         .charAt(index));
     }
    
     return sb.toString();
    }

    public static void main(String[] args)
    {
        int seed = 10;
        Scanner x = new Scanner(System.in);
        System.out.println("PLease enter Distance covered");
        int Distance = x.nextInt();
        String num = taxi_metre.getAlphaNumericString(seed);
        double cost;
        //System.out.println(num);

        if (Distance <= 5)
            cost = 100;
        else if(Distance > 5 && Distance <= 15)
            cost = 100 + (Distance-5) * 10;
        else if(Distance > 15 && Distance <= 25)
            cost = 100 + 10 * 10 + (Distance - 15)* 8;
        else
            cost = 100 + 10 * 10 + 10 * 8 + (Distance-25) * 5;

        System.out.println(" Taxi no: "+num+"\n"+"Distance covered: "+Distance+"Amount: "+cost);
        x.close();


    }
}