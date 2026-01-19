package labact6;

public class MicrowaveOven extends Device {
    private int timer;
    private int temperature;

    public MicrowaveOven() {
        timer = 0;
        temperature = 100;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
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
            System.out.println("Microwave Oven is ON | Timer: " + timer + " | Temperature: " + temperature);
        } else {
            System.out.println("Microwave Oven is OFF");
        }
    }
}
