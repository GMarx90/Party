import java.util.*;

public class Party {

    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuests=new HashMap<>();

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
        phoneToGuests.put(phoneNumber,guest);


    }
    public void displayGuests(){

        guests
                .forEach(Guest::getGuestInformation);
      }
    public void displayMeals(){
        for (String meal:meals ){
            System.out.println(meal);
        }
    }
    public void findByName(){
        System.out.println("Podaj imię gościa");
        String name=scanner.nextLine();
        Guest byName =guests.stream()
                .filter(guest -> guest.getName().equals(name))
                .findFirst().get();
        byName.getGuestInformation();

    }
    public void findByNumber(){
        System.out.println("Podaj numer gościa");
int phoneNumber=Integer.valueOf(scanner.nextLine());
Guest guest= phoneToGuests.get(phoneNumber);
        System.out.println("Taki numer ma: "+ guest.getName());
    }

}