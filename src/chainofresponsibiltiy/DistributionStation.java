package chainofresponsibiltiy;

public class DistributionStation implements PackageHandler {
    private int initialCapacity;
    private int currentCapacity;
    private PackageHandler closestHandler;
    private final String location;

    public DistributionStation(int capacity, String location) {
        this.initialCapacity = capacity;
        this.currentCapacity = capacity;
        this.location = location;
    }

    public void setClosestHandler(PackageHandler closestHandler) {
        this.closestHandler = closestHandler;
    }

    public void handlePackage(Package pkg) {
        if (initialCapacity == currentCapacity) {
            System.out.println("Distribution station: " + this.location + " got its first package.");

        }
        if (this.currentCapacity > 0) {
            this.currentCapacity--;
            System.out.println(
                "Package delivered to destination: " + pkg.getDestination() + ", from distribution station: "
                    + this.location);
        } else {
            System.out.println("Capacity is exceeded for distribution station: " + this.location
                + ". Forwarding package to next distribution station.");
            closestHandler.handlePackage(pkg);
        }
    }
}
