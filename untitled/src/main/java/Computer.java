//import Drive.Drive;
import Drive.Drive;
import USBDevices.Mouse;
import USBDevices.USBDivice;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Computer {
    Monitor monitor;
    Drive drive ;
List<USBDivice> usbDivices =new ArrayList<>();

}
