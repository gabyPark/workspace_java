package ch8;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		// vehicle.run();
	
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFee();
		}
		
		vehicle.run();
	}

}
