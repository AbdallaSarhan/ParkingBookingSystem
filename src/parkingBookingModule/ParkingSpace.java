package parkingBookingModule;

import userModule.Client;

public class ParkingSpace {
	// IDref used to reference next parking space id
	private static long IDref = 0;
	private long spaceId;
	private ParkingLot lot;
	private boolean available = true;
	private Sensor sensor;
	private Booking booking;

	
	
	public ParkingSpace(ParkingLot lot, Sensor sensor) {
		this.IDref = IDref +1;
		this.spaceId = IDref + 1;
		this.lot = lot;
		this.sensor = sensor;
	}
	
	public boolean isAvailable() {
		
		return available && sensor.getVacancy();
	}
	
	public void book(Client client, int hoursRequested) {
		
		
		sensor.setVacancy(false);
		
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
		// adds hours to hours booked
		// booking.setenddate() need a setter for end date
		return booking;
	}
	
	public long getId() {
		return spaceId;
	}
	
	public void enableSpace() {
		available = true;
	}
	
	public void disableSpace() {
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





}
