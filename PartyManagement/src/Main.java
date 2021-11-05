import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Party party=new Party();
        Scanner scanner = new Scanner(System.in);
        boolean decision= true;


        while (decision) {

        System.out.println("Wybierz opcje");
        System.out.println("1. Wyświetl listę gości");
        System.out.println("2. Dodaj gościa ");
        System.out.println("3. Wyświetl potrwy ");
        System.out.println("4. Znajdz po numerze telefonu ");
        System.out.println("5. Znajdz po imieniu ");
        System.out.println("6. Wyjdż ");

            int costumerChoice = scanner.nextInt();

            switch (costumerChoice) {
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> System.out.println("Znalazłem po numerze telefonu ");
                case 5 -> System.out.println("Znalazłem po imieniu ");
                case 6 -> decision=false;
            }
        }
    }
}
