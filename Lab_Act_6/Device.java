package labact6;

public class Device {
    private boolean isOn;

    public Device() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
        System.out.println(getClass().getSimpleName() + " is " + (isOn ? "ON" : "OFF"));
    }

    public void showStatus() {
        if (isOn) {
            System.out.println(getClass().getSimpleName() + " is ON");
        } else {
            System.out.println(getClass().getSimpleName() + " is OFF");
        }
    }
}
