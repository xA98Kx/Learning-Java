public class Program21 {
    static int n = 0;
    static String recurringPrint(String s)
    {
        if(s.length()!=0){
        System.out.println(s);
        n++;
        return recurringPrint(s.substring(0,4-n));
        }
        else
        {
            return "";
        }
    }
    public static void main(String[] args) {
        recurringPrint("MANGO");
    }
}
