public class Guest {
    private  String name;
    private  String meal;
    private  int phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeal() {
        return meal;
    }


    public boolean isVegan() {
        return isVegan;
    }
public void getGuestInformation(){
    System.out.println("Imię: "+name);
    System.out.println("Potrawa: "+meal);
    System.out.println("Numer telefonu: "+phoneNumber);
    String isVeganAnswer = isVegan ? "tak" : "nie";
    System.out.println("Czy jest veganinem: "+isVeganAnswer);
}

}
