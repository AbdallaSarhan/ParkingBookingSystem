package parkingBookingModule;

public class ParkingSpace {
	
	private int spaceID;
	private ParkingLot lot;
	private boolean available;
	
	
	public ParkingSpace(ParkingLot lot) {
		this.lot = lot;
	}
	
	public ParkingLot getLot() {
		
		return this.lot;
	}

}
