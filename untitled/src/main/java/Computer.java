//import Drive.Drive;

import drive.Drive;
import usbDevices.USBDivice;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Computer {
    Monitor monitor;
    Drive drive;
    List<USBDivice> usbDivices = new ArrayList<>();

}
