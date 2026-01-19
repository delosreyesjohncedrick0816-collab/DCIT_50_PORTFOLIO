package labact6;

public class Television extends Device {
    private int channel;
    private int volume;

    public Television() {
        channel = 1;
        volume = 10;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        showStatus();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Television is ON | Channel: " + channel + " | Volume: " + volume + "%");
        } else {
            System.out.println("Television is OFF");
        }
    }
}
