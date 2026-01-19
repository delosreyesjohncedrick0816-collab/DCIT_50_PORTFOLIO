package labact6;

public class LampShade extends Device {
    private int brightness;
    private String color;

    public LampShade() {
        brightness = 50;
        color = "White";
    }

    public LampShade(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
    }

    public LampShade(LampShade other) {
        brightness = other.brightness;
        color = other.color;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        showStatus();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Lamp Shade is ON | Brightness: " + brightness + "% | Color: " + color);
        } else {
            System.out.println("Lamp Shade is OFF");
        }
    }
}
