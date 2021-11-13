import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Data

public class Monitor {
    private int width = 3840;
    private int height = 1920;

    Scanner scanner = new Scanner(System.in);

    public void setMonitorResolution() {
        System.out.println("Wybierz Rzodzielczość");
        System.out.println("1. HD (HD Ready)");
        System.out.println("2. 1080p Full HD (FHD) ");
        System.out.println("3. QUAD HD ");
        System.out.println("4. 4K (Ultra HD)");
        int costumerResulution = scanner.nextInt();
        switch (costumerResulution) {
            case 1 -> {
                width = 1280;
                height = 720;
                System.out.println("Ustawiono rozdzielczość HD");
            }
            case 2 -> {
                width = 1920;
                height = 1080;
                System.out.println("Ustawiono rozdzielczość FullHD");
            }
            case 3 -> {
                width = 2560;
                height = 1440;
                System.out.println("Ustawiono rozdzielczość QUAD HD");
            }
            case 4 -> {
                width = 3840;
                height = 2160;
                System.out.println("Ustawiono rozdzielczość UHD");
            }
        }


    }

    public void getResolution() {

        System.out.println("Aktualna rozdzielczość ekranu: " + width + "x" + height);
    }


}