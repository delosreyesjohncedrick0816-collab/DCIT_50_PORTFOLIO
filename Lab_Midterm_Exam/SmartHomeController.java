package midtermlabexam;

public class SmartHomeController {
    Device[] devices;

    public SmartHomeController(Device[] devices) {
        this.devices = devices;
    }

    public void turnAllOn() {
        for (Device d : devices) {
            d.setStatus("ON");
        }
        System.out.println("All devices are now ON.");
    }

        public void turnAllOff() {
        for (Device d : devices) {
            d.setStatus("OFF");
        }
        System.out.println("All devices are now OFF.");
    }
}

