package midtermlabexam;

public class LightBulb extends Device {
	int brightnessLevel;
	String color;
	
	LightBulb(String deviceName, String status, String location, int brightnessLevel, String color){
		super(deviceName, status, location);
		this.brightnessLevel=brightnessLevel;
		this.color=color;
	}
		
	LightBulb(String deviceName, String location){
		super(deviceName, "ON", location);
		this.brightnessLevel=50;
		this.color="Warm White";
		
	}
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Brightness Level: "+brightnessLevel);
		System.out.println("Color: "+color);
		}
	void adjustBrightness(int level) {
		this.brightnessLevel=level;
	}

}
