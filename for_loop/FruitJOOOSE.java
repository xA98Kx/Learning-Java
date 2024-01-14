import java.util.Scanner;
public class FruitJOOOSE
{
    int product_code, pack_size, product_price;
    String flavous, pack_type;
    FruitJOOOSE()
    {
        product_code = 0;
        product_price = 0;
        pack_size = 0;
        flavous = "";
        pack_type = "";
    }
    void input()
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter flavour");
        flavous = x.nextLine();
        System.out.println("pack type");
        pack_type = x.nextLine();
        System.out.println("Enter Product Code");
        product_code = x.nextInt();
        System.out.println("pack size");
        pack_size = x.nextInt();
        System.out.println("Production price");
        product_price = x.nextInt();
        x.close();
    }
    void discount()
    {
        product_price -=10;
    }
    void display()
    {
        System.out.println("Product Code: "+product_code);
        System.out.println("Flavour: "+flavous);
        System.out.println("Pack type: "+pack_type);
        System.out.println("Pack Size: "+pack_size);
        System.out.println("Product Cost: "+product_price);
    }
    public static void main(String[] args) {
        FruitJOOOSE ob = new FruitJOOOSE();
        ob.input();
        ob.discount();
        ob.display();
    }
}