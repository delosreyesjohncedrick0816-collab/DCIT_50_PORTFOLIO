package labact6;

import java.util.List;

public class DeviceUtils {
    public static void setDevicesPower(List<Device> devices, boolean power) {
        for (Device d : devices) {
            d.setOn(power);
        }
    }

    public static int countDevicesOn(List<Device> devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isOn()) count++;
        }
        return count;
    }
}
