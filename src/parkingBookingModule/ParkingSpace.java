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
		this.setSensor(sensor);
	}
	
	public boolean getAvailability() {
		
		return available;
	}
	
	public Booking createBooking() {
		
		Booking booking = new Booking(null, null, null, null);
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
	
	protected void enable() {
		// sensor.isvacant = true?
		// or
		// isOpen = true?
	}
	
	protected void disable() {
		// sensor.isvacant = false?
		// or
		// isOpen = false?
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

}
