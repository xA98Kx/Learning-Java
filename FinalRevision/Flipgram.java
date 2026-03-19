import java.util.Scanner;

public class Flipgram {
    String word;

    public Flipgram(String s) {
        word = s;
    }

    boolean isHetero()
    {
        String lwrCase = word.toLowerCase();
        for(int i=0;i<lwrCase.length(); i++)
        {
            char currentChar = lwrCase.charAt(i);
            if(lwrCase.indexOf(currentChar, i+1)!=-1) return false;
        }
        return true;
    }

    String flip()
    {
        int len = word.length();
        int mid = len/2;
        char midl = word.charAt(mid);
        String flipa;

        if(len%2==0)
            flipa = word.substring(mid)+word.substring(0,mid);
        else
             flipa = word.substring(mid+1)+midl+word.substring(0,mid);
        return flipa;
    }

    void display()
    {
        if(!isHetero())
        {
            System.out.println(flip().toUpperCase());
        }
        else{
            System.out.println("HETEROGRAM");
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String sc = x.next();

        Flipgram obj = new Flipgram(sc);
        obj.display();
        x.close();
    }
    
}
