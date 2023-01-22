package chainofresponsibiltiy;

public interface PackageHandler {
    void setClosestHandler(PackageHandler closestHandler);
    void handlePackage(Package pkg);
}
