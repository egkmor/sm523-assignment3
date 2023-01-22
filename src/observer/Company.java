package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Company {
    private List<User> users = new ArrayList<>();

    public void addObserver(User user) {
        users.add(user);
    }

    public void removeObserver(User user) {
        users.remove(user);
    }

    public void notifyObservers() {
        for (User user : users) {
            user.update(this);
        }
    }

    abstract String getName();
}
