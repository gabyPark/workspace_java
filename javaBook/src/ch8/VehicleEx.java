package ch8;

public class VehicleEx {

	public static void main(String[] args) {
		Vehicle ve = new Bus(); 
			
		 ve.run();
		// ve.checkFee();

		 Bus bus = (Bus) ve;
		 
		 bus.run();
		 bus.checkFee();
	}
}
