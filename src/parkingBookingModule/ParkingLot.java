package parkingBookingModule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class ParkingLot {
	
//	private ArrayList<ParkingSpace> spaces = new ArrayList<ParkingSpace>(100);
	private List<ParkingSpace> list = Arrays.asList(new ParkingSpace[100]);
	private String lotID = UUID.randomUUID().toString();
	private ParkingSpace[] spaces = new ParkingSpace[100];
	private boolean isOpen;
	
	
	public ParkingLot() {
		
	}
	
	public ParkingSpace[] getParkingSpaces(){
		
		return spaces;
	}
	
	public void enableLot() {
		
		this.isOpen = true;
	}
	
	public void disableLot() {
		this.isOpen = false;
	}
	
	public boolean getStatus() {
		
		return this.isOpen;
	}

}
