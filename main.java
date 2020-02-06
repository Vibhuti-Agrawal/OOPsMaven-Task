import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        newYearGift[] gifts = new newYearGift[5];
        gifts[0] = new chocolate("KitKat",25);
        gifts[1] = new sweets("Sonpapri",10);
        gifts[2] = new chocolate("Munch",20);
        gifts[3] = new sweets("Ladoo",5);
        gifts[4] = new chocolate("Perk",15);

        Scanner sc = new Scanner(System.in);
        int var = 1;
        System.out.println("Enter 1 for viewing candies in specific range of their quantities");
        System.out.println("Enter 2 for packing specific gift");
        System.out.println("Enter 0 to exit");
        while(var!=0)
        {
            System.out.println("Please Select your option");
            var = sc.nextInt();
            switch(var){
                case 1:
                    System.out.println("Enter Range");
                    int l = sc.nextInt();
                    int r = sc.nextInt();
                    int c = 0;
                    System.out.println("Available gifts in the given range are:");
                    for (int i = 0; i < 5; i++)
                    {
                        if(gifts[i].getQuantity()>=l && gifts[i].getQuantity()<=r ) {
                            System.out.println(gifts[i].getName());
                            c++;
                        }
                    }
                    if(c==0)
                    {
                        System.out.println("Sorry! No gifts found in the given range");
                    }
                    break;

                case 2:
                    System.out.println("Enter the gift name to be packed");
                    String s = sc.next();
                    int f = 0;
                    for (int i = 0; i < 5; i++)
                    {
                        if(s.toLowerCase().equals(gifts[i].getName().toLowerCase()))
                        {
                            gifts[i].packing();
                            f = 1;
                            break;
                        }
                    }
                    if(f==0){
                        System.out.println("Sorry! Your gift name is not available in the store. Please enter another value!");
                        for (int i = 0; i < 5 ; i++)
                        {
                            System.out.println(gifts[i].getName());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
