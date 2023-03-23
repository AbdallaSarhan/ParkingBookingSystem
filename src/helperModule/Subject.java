package helperModule;

import parkingBookingModule.ParkingSpace;

public interface Subject {
	
	// Subject (publisher) for the Observer design pattern
	
	public void attach(ParkingSpace parkingSpace);
	
	
	public void detach(ParkingSpace parkingSpace);
	
	
	public void notifyObservers(ParkingSpace parkingSpace);
	

}
