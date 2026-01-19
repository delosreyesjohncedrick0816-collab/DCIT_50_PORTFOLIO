package labact6;

public class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;

    public AirConditioner() {
        fanSpeed = 3;
        temperature = 24;
    }

    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        showStatus();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Air Conditioner is ON | Fan Speed: " + fanSpeed + " | Temperature: " + temperature);
        } else {
            System.out.println("Air Conditioner is OFF");
        }
    }
}
