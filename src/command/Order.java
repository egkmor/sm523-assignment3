package command;

public class Order {
    private String product;
    private String status;

    public Order(String product) {
        this.product = product;
        this.status = "Waiting";
    }

    public void process() {
        System.out.println("Processing order for: " + product);
        this.status = "Processed";
    }

    public void cancel() {
        if (this.status.equals("Processed")) {
            System.out.println("Cancelling order for: " + product);
            this.status = "Cancelled.";
        } else {
            System.out.println("Cannot cancel the order, Order is not processed yet.");

        }
    }
}
