package userModule;

import parkingBookingModule.Booking;
import parkingBookingModule.BookingSystem;
import parkingBookingModule.ParkingSpace;

public abstract class Client extends Account {
	
	private String licensePlate;
	private BookingSystem bookingSystem;
	private ParkingSpace parkingSpace;
	
	
	public Client(String name, String email, String password, String licensePlate) {
		super(name, email, password);
	}
	
	public String getName() {
		
		return name;
	}
	
	public String getLicensePlate() {
		
		return this.licensePlate;
	}
	
	public abstract void register(String name, String email, String password, String licensePlate);
	
	
	public ParkingSpace getParkingSpace() {
		
		return this.parkingSpace;
	}
	
	public Booking bookParkingSpace(ParkingSpace parkingSpace) {
		
		return null;
	}
	
	public Booking editBooking(ParkingSpace parkingSpace) {
		
		return null;
	}
	
	public Booking cancelBooking(ParkingSpace parkingSpace) {

		return null;
	}
	
	public Booking extendBooking(ParkingSpace parkingSpace) {
		
		return null;
	}
	
	
	
	
}
