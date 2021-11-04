import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        System.out.println("Wybierz opcje");
        System.out.println("1. Wyświetl listę gości");
        System.out.println("2. Dodaj gościa ");
        System.out.println("3. Wyświetl potrwy ");
        System.out.println("4. Znajdz po numerze telefonu ");
        System.out.println("5. Znajdz po imieniu ");
        System.out.println("6. Wyjdż ");
        boolean decision= true;
        while (decision) {
            Scanner scanner = new Scanner(System.in);
            int costumerChoice = scanner.nextInt();

            switch (costumerChoice) {
                case 1 -> System.out.println("Lista gości");
                case 2 -> System.out.println("Dodaje gościa ");
                case 3 -> System.out.println("Lista potraw ");
                case 4 -> System.out.println("Znalazłem po numerze telefonu ");
                case 5 -> System.out.println("Znalazłem po imieniu ");
                case 6 -> decision=false;
            }
        }
    }
}
