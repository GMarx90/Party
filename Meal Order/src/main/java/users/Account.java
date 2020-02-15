package users;


public class Account {
    private boolean active;

    private static Address address;
    private String email;

    public void setEmail(String email) {
        if (email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Wrong email format");
        }
    }

    public Account(Address address) {
        this.address = address;
        if (address != null) {
            activate();
        } else {
            this.active = false;
        }
    }

    public void setAddress(Address address) {
        this.address = address;

    }

     Address getAddress() {
        return address;
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
