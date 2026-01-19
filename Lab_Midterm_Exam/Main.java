package midtermlabexam;

public class Main {
	public static void main(String[] args) {
		
		LightBulb l1= new LightBulb("Lamp Bulb", "ON", "Living Room", 40, "Yellow" );
		Thermostat t1= new Thermostat("AC Thermostat", "ON", "Bedroom", 20.0, "Cooling");
		Thermostat t2= new Thermostat("Office Thermostat", "ON", "Hallway", 24.0, "Cooling");
		
		Device[] devices= {l1,t1,t2};
		for(Device d:devices) {
			d.displayInfo();
			System.out.println();
		
				}
		

		

}
}