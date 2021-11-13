package usbDevices;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mouse implements USBDivice {
    private String name;

    @Override
    public boolean isConnect() {
        System.out.println("Mouse connected");
        return true;
    }

    @Override
    public boolean isDisconnect() {
        System.out.println("Mouse disconnected");
        return true;
    }

    @Override
    public String getName() {

        return name;
    }
}
