package parkingBookingModule;

import java.util.ArrayList;

import paymentModule.PaymentMethod;
import userModule.Client;

public class BookingSystem {
	private ArrayList<ParkingSpace> parkingSpaces = new ArrayList<>();
	private static ArrayList<ParkingLot> parkinglots = new ArrayList<>();
	private PaymentMethod payment;
	private Client client;
	private Booking booking;
	private Sensor sensor;
	private ParkingSpace parkingSpace;
	private static final BookingSystem bookingSystem = new BookingSystem();
	public ArrayList<ParkingSpace> getAvailableSpaces(){
		
		return null;
	}
	
	public static BookingSystem getInstance() {
		return bookingSystem;
	}
	
	public BookingSystem() {
		
	}
	
	public void addParkingLot(ParkingLot parkingLot) {
		this.parkinglots.add(parkingLot);
	}
	
	public ArrayList<ParkingLot> getParkingLots(){
		return this.parkinglots;
	}
	
	public Booking bookParkingSpace(Client user, ParkingSpace parkingSpace) {
		//to book a parking space:
			//client must be registered after logging in
			//space must not be occupied
			//space must not be booked by another client (user)
			//requires the cost of an hour (of the type of a client) as the deposit
			//client must provide valid licence plate number
		
//		if (client.isLoggedIn() && client.getRegistrationStatus() == true && sensor.getVacancy() == true
//				&& parkingSpace.getAvailability() == true)
//			return booking;
		
		return null;
		
	}
	
	public boolean payForBooking(Client user, Booking bookingInfo) {
		
		return false;
	}
	
	public Booking editBooking(Client user, ParkingSpace parkingSpace) {
		
		
		return null;
		
	}
	
	public Booking cancelBooking(Client user, ParkingSpace parkingSpace) {
		
		return null;
	}
	
	public Booking extendParkingDuration(Client user, ParkingSpace parkingSpace) {
		
		return null;
	}
	
	public Booking getCarInfo() {
		
		return null;
	}

}
