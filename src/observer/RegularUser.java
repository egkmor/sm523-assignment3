package observer;

public class RegularUser extends User {

    private static final String USER_TYPE = "Regular user";

    public RegularUser(String name) {
        super(name);
    }

    public void update(Company company) {
        System.out.println(USER_TYPE + " " + getName() + ", is notified that the company: " + company.getName()
            + ", has a 5% discount!");
    }
}
