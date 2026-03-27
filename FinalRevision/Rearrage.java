import java.util.Scanner;

class Rearrange
{
    String wrd, newwrd;
    
    
    Rearrange()
    {
        wrd="";
        newwrd=""; 
    }


    void readword()
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd = x.next();
        wrd = wrd.toUpperCase();
        
    }

    void freq_vow()
    {
        int f1=0;
        int f2=0;
        for(int i=0; i<wrd.length(); i++)
        {
            if ("aeiou".indexOf(wrd.charAt(i)) == -1)
                f1+=1;
            else
                f2+=1;
        }
    }

}