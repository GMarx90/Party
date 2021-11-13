package usbDevices;

import java.util.Scanner;

public class MemoryStick implements USBDivice {
    public boolean isEjected() {
        return ejected;
    }

    String name;
    boolean ejected;
    Scanner scanner = new Scanner(System.in);

    public MemoryStick(String name, boolean ejected) {
        this.name = name;
        this.ejected = ejected;
    }

    @Override
    public boolean isConnect() {
        System.out.println("Memory stick is connected");
        return true;
    }

    @Override
    public boolean isDisconnect() {
        if (ejected) {
            System.out.println("Memory stick is diconnected");
        } else {
            String decision;
            System.out.println("Please eject memory first");
            System.out.println("Do you want it now?   Y/N");
            decision = scanner.nextLine();
            if (decision.equals("Y")) {
                ejectMemoryStick();
                System.out.println("...");
                System.out.println("...");
                //ejected = true;
                System.out.println("...");
                System.out.println("Memory stick is diconnected");
            } else if (decision.equals("N")) {
                System.out.println("Do you want to force remove?  Y/N");
                decision = scanner.nextLine();

                if (decision.equals("Y")) {
                    System.out.println("Memory stick is forced removed");
                } else if (decision.equals("N")) {
                    System.out.println("ERROR! Please eject Memory Stick first");
                } else {
                    System.out.println("@#%$@#^@%!%^&$#");
                }
            } else {
                System.out.println("Wrong answer");
            }
        }
        return true;
    }

    private void ejectMemoryStick() {
        ejected = true;
        System.out.println("Seftly removed device");
    }

    @Override
    public String getName() {
        return name;
    }
}
