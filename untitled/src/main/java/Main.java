public class Main {
    public static void main(String[] args) {
        Monitor monitor=new Monitor();
        HDDDrive drive=new HDDDrive("HDD");
        Computer computer=new Computer(monitor, drive);
/*
        System.out.println(monitor.getWidth( ));
        System.out.println(monitor.getHeight());
monitor.setMonitorResolution();*/

monitor.getResolution();
        File jpg=new File("jpg");
        File jpg2=new File("jpg2");
        File jpg3 =new File("jpg3");
        File jpg4 =new File("jpg4");
        drive.addFile(jpg);
       // System.out.println("Dodano pierwszy plik");
        drive.addFile(jpg2);
        //System.out.println("Dodano drugi plik");
        drive.addFile(jpg3);
       // System.out.println("Dodano trzeci plik");
        drive.addFile(jpg4);
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
