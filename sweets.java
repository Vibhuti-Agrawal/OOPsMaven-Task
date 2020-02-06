public class sweets extends newYearGift
{
    public sweets(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    void packing()
    {
        System.out.println(this.getName()+" are packing!");
    }

}
