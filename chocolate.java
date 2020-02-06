public class chocolate extends newYearGift
{
    public chocolate(String name, int quantity) {
        super(name, quantity);
    }

    @Override
    void packing()
    {
        System.out.println(this.getName() + " is packing!");
    }

}
