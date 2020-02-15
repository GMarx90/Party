package users;


public class Account {
    private boolean active;

    public Account(Address addess) {
        this.addess = addess;
    }

    private Address addess;

    public Address getAddess() {
        return addess;
    }

    public Account() {
        this.active = false;
    }

    public void activate() {
        this.active = true;
    }

    public boolean isActive() {
        return this.active;
    }
}
