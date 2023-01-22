package observer;

public abstract class User {

    public String getName() {
        return name;
    }

    private String name;

    protected User(String name) {
        this.name = name;
    }

    abstract void update(Company company);
}
