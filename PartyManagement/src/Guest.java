import java.util.Scanner;

public class Guest {
    private  String name;
    private  String meal;
    private  int phoneNumber;
    private boolean isVegan;
Scanner scanner=new Scanner (System.in);
    
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
public void addGuest(){
    System.out.println("Podaj imię: ")
    name=scannner.nextLine();
    System.out.println("Podaj potrawę: ")
    meal= scannner.nextLine();
    System.out.println("Podaj numer telefonu: ")
    phoneNumber=scanner.nextInt();
    System.out.println("Czy jest veganinem: Y/N");
    isVeganAnswer=scanner.nextLine();
    isVegan=false;
    if (isVeganAnswer.equals("Y"){
        isVegan=true}
    if (isVeganAnswer.equals("N"){
        isVegan=false}
        else{
             System.out.println("Zła odpowiedź")}
        
    String isVeganAnswer = isVegan ? "tak" : "nie";
    System.out.println("Czy jest veganinem: "+isVeganAnswer);
}
    
    
}
