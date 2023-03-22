package userModule;

import java.util.ArrayList;

import parkingBookingModule.Booking;
import parkingBookingModule.BookingSystem;
import parkingBookingModule.ParkingSpace;

public abstract class Client extends Account {
	
	private String licensePlate;
	private BookingSystem bookingSystem = BookingSystem.getInstance();
	private ParkingSpace parkingSpace;
	protected boolean isRegistered = false;
	protected boolean isVerified = false;
	
	
	public Client(String name, String email, String password, String licensePlate) {
		super(name, email, password);
		this.licensePlate = licensePlate;
	}
	
	public String getName() {
		
		return name;
	}
	
	@Override
	public void login(String name, String password) {
		
		if(this.name  == name && this.password == password && this.isVerified == true) {
			loggedIn = true;
		}
		
	}
	
	public String getLicensePlate() {
		
		return this.licensePlate;
	}
	
	public String getEmail() {
		
		return this.email;
	}
	
	public void setName(String name) {
		 this.name = name;
	}
	
	public void setLicensePlate(String licensePlate) {
		
	 this.licensePlate = licensePlate;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getRegistrationStatus() {
		
		return this.isRegistered;
	}
	public boolean getVerificationStatus() {
		
		return this.isVerified;
	}
	
	public void verify() {
		
		this.isVerified = true;
	}
	public abstract void register();
	
	public ArrayList<ParkingSpace> getAvailableSpaces(){
		
		return bookingSystem.getAvailableSpaces();
		
	}
	
	
	public ParkingSpace getSelectedParkingSpace() {
		
		return this.parkingSpace;
	}
	
	public Booking bookParkingSpace(ParkingSpace parkingSpace, int hours) {
		
		return bookingSystem.bookParkingSpace(this, parkingSpace, hours);
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
