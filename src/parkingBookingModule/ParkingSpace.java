package parkingBookingModule;

public class ParkingSpace {
	
	private int spaceId;
	private ParkingLot lot;
	private boolean available;
	private Sensor sensor;
	private boolean isOpen;
	private Booking booking;

	
	
	public ParkingSpace(int spaceId, ParkingLot lot, boolean available, Sensor sensor) {
		this.spaceId = spaceId;
		this.lot = lot;
		this.available = available;
		this.sensor = sensor;
	}
	
	public ParkingSpace() {
		
	}
	
	public boolean getAvailability() {
		
		return available;
	}
	
	public Booking createBooking() {
		
		Booking booking = new Booking(null, null, 0);
		// null for now, add specific attributes based on different bookings
		
		return booking;
	}
	
	public Booking editBooking() {
		//changes attributes in booking object
		return booking;
	}
	
	public Booking cancelBooking() {
		// deletes booking
		return booking;
	}
	
	public Booking extendBooking() {
		// adds time to endDate 
		// booking.setenddate() need a setter for end date
		return booking;
	}
	
	public int getId() {
		return spaceId;
	}
	
	public void enableSpace() {
		// sensor.isvacant = true?
		// or
		// isOpen = true?
		sensor.setVacant(true);
		available = true;
	}
	
	public void disableSpace() {
		// sensor.isvacant = false?
		// or
		// isOpen = false?
		sensor.setVacant(false);
		available = false;
	}
	
	
	public ParkingLot getLot() {

		return this.lot;
	}

	public Sensor getSensor() {
		
		return sensor;
	}
	

	public void setSensor(Sensor sensor) {
		
		this.sensor = sensor;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

}
