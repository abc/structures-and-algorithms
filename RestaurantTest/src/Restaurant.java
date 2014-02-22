public class Restaurant {

    private Order[] orders;

    public Restaurant ()
    {
        this.orders = new Order[0];
    }

    public void add (Order order)
    {
        this.orders = newOrders();
        this.orders[orders.length - 1] = order;
    }

    public int orderCount ()
    {
        return this.orders.length;
    }

    public Order order (int orderNo)
    {
        return this.orders[orderNo];
    }

    public Order[] getOrders (String basedOn)
    {
        if (basedOn.equalsIgnoreCase("unpaid"))
        {

        }
    }

    // Create a new orders array with all orders and one extra space then return it.
    private Order[] newOrders ()
    {
        Order[] newOrders;

        if (this.orders.length == 0)
        {
            newOrders = new Order[1];
        }
        else
        {
            newOrders = new Order[this.orders.length];

            System.arraycopy(orders, 0, newOrders, 0, this.orders.length);
        }

        return newOrders;
    }

    public void pay (int orderNumber)
    {
            this.orders[orderNumber].pay();
    }

    public void deliver (int orderNumber)
    {
        Delivery order = (Delivery)this.orders[orderNumber];
        order.pay();
        this.orders[orderNumber] = order;
    }
}
