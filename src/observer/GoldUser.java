package observer;

public class GoldUser extends User {

    private static final String USER_TYPE = "Gold user";

    public GoldUser(String name) {
        super(name);
    }

    public void update(Company company) {
        System.out.println(USER_TYPE + " " + getName() + ", is notified that the company: " + company.getName()
            + ", has a 10% discount!");
    }
}
