package midtermlabexam;

public class Thermostat extends Device {
	double temperature;
	String mode;
	
	Thermostat(String deviceName, String status, String location, double temperature){
		super(deviceName, status, location);
		this.temperature=temperature;
		this.mode="COOL";
	}
		
	Thermostat(String deviceName, String status, String location, double temperature, String mode){
		super(deviceName, status, location);
		this.temperature=temperature;
		this.mode=mode;
		
	}
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("Temperature: "+temperature);
		System.out.println("Mode: "+mode);

	}
	void setTemperature(double temp) {
		this.temperature=temp;
	}
	void setTemperature(double temp, String mode) {
		this.temperature=temp;
		this.mode=mode;
	}

	
}
