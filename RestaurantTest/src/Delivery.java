public class Delivery extends Order {

    private String name;
    private String address;
    private boolean delivered;

    public Delivery(double basicCost, String name, String address)
    {
        super (basicCost);
        this.name = name;
        this.address = address;
        if (basicCost < 20)
        {
            this.finalCost += 3;
        }
    }

    public void deliver ()
    {
        this.paid = true;
    }

    public boolean isDelivered ()
    {
        return this.delivered;
    }

    private void displayDeliveryDetails ()
    {
        System.out.print("Name:" + this.name + "\tAddress:" + this.address);
    }

    public void display ()
    {
        if (paid)
        {
            System.out.print("Delivery order paid. Details:");
            this.displayDeliveryDetails();
            this.displayCost();
        }
        else
        {
            System.out.println("Delivery order not yet paid. Details:");
            this.displayDeliveryDetails();
            this.displayCost();
        }
    }

}
