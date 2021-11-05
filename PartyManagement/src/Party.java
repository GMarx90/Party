import java.util.*;

public class Party {

    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    public void addGuest() {

        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine();
        System.out.println("Podaj preferowany posiłek gościa");
        String meal = scanner.nextLine();
        System.out.println("Podaj numer telefonu gościa");
        int phoneNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Czy "  + name + " jest Weganinem? Y/N");
        String vegeAnserw = scanner.nextLine();
        boolean isVegan = false;

        if (vegeAnserw.equals("N")) {
            isVegan = false;}
            if (vegeAnserw.equals("Y")) {
            isVegan = true;
        } else {
            System.out.println("Niewłaściwa odpowiedź");

            }

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);
        guests.add(guest);
        meals.add(meal);


    }
    public void displayGuests(){

        guests
                .forEach(Guest::getGuestInformation);
        /*for (Guest guest:guests){
            guest.getGuestInformation();
        }
*/    }
    public void displayMeals(){
        for (String meal:meals ){
            System.out.println(meal);
        }
    }

}