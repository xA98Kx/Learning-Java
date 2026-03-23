public class TestLoopOutput {
    
    static void test(int count)
    {
        if (count==0)
        {
            System.out.println(" ");
        }
        else
        {
            System.out.println("Bye"+count);
            test(--count);
            System.out.println(" "+count);
        }
    }
    public static void main(String[] args) {
        test(4);
    }
}
