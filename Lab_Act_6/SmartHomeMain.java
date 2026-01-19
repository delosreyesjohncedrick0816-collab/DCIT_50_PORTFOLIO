package labact6;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeMain {
    public static void main(String[] args) {
    	
        AirConditioner ac = new AirConditioner();
        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1);
        Television tv = new Television();
        MicrowaveOven microwave = new MicrowaveOven();

        List<Device> devices = new ArrayList<>();
        devices.add(ac);
        devices.add(lamp1);
        devices.add(lamp2);
        devices.add(tv);
        devices.add(microwave);

        DeviceUtils.setDevicesPower(devices, true);

        System.out.println("\nDevice Status:");
        for (Device d : devices) {
            d.showStatus();
        }

        System.out.println("\nDevices ON: " + DeviceUtils.countDevicesOn(devices));

        DeviceUtils.setDevicesPower(devices, false);

        System.out.println("\nDevices ON after turning off: " + DeviceUtils.countDevicesOn(devices));
    }
}
