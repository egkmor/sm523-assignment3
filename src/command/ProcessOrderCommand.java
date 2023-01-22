package command;

public class ProcessOrderCommand implements Command {
    private Order order;

    public ProcessOrderCommand(Order order) {
        this.order = order;
    }

    public void execute() {
        order.process();
    }
}
