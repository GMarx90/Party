import drive.SDDDrive;
import usbDevices.Mouse;
import yoursFile.YoursFile;
import yoursFile.imageFile.JPGImageFile;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        SDDDrive drive = new SDDDrive("HDD");
        Mouse mysz = new Mouse("myszka");
 /*       MemoryStick pendrive=new MemoryStick("pendrive", false);
        //Computer computer=new Computer(monitor, drive, pendrive);
        pendrive.isConnect();
        System.out.println(pendrive.isEjected());
        pendrive.isDisconnect();
        System.out.println(pendrive.isEjected());

      System.out.println(monitor.getWidth( ));
        System.out.println(monitor.getHeight());
monitor.setMonitorResolution();

monitor.getResolution();*/
        JPGImageFile jpg = new JPGImageFile("jpg", 12,32);
        JPGImageFile jpg2 = new JPGImageFile("jpg2", 12,32);
        JPGImageFile jpg3 = new JPGImageFile("jpg3", 12,32);

        drive.addFile(jpg);
        // System.out.println("Dodano pierwszy plik");
        drive.addFile(jpg2);
        //System.out.println("Dodano drugi plik");
        drive.addFile(jpg3);
        // System.out.println("Dodano trzeci plik");
        drive.addFile(new JPGImageFile("jpg4",12,64));
        // System.out.println("Dodano czwarty plik");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Zawartość dysku");

        drive.listFile();
       /* System.out.println("Znalazłem plik: " );
       drive.findFile("jpg");*/
    }
}
