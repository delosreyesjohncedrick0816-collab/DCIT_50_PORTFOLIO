package midtermlabexam;

public class Device {
	String deviceName;
	String status;
	String location;
	static int deviceCount;
	
	public Device(){
				
	}
	public Device(String deviceName, String status, String location){
		deviceCount++;
		this.deviceName=deviceName;
		this.status=status;
		this.location=location;
	}
	void turnOff() {
		this.status="OFF";
		System.out.println("Device "+deviceName+" turned off.");
		
	}
	void turnOn() {
		this.status="ON";
		System.out.println("Device "+deviceName+" turned on.");
	}
	void displayInfo() {
		System.out.println("Device name: "+deviceName);
		System.out.println("Status: "+status);
		System.out.println("Location: "+location);
	}
	void showDeviceCount() {
		System.out.println("Total of devices: "+deviceCount);
	}
	void setStatus(String status) {
		this.status=status;
	}
}
