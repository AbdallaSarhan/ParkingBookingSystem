package parkingBookingModule;

import java.util.ArrayList;

import paymentModule.PaymentMethod;
import userModule.Client;

public class BookingSystem {
	private ArrayList<ParkingSpace> parkingSpaces;
	private ArrayList<ParkingLot> parkinglots;
	private PaymentMethod payment;
	
	public ArrayList<ParkingSpace> getAvailableSpaces(){
		
		return null;
	}
	
	public ArrayList<ParkingLot> getParkingLots(){
		return parkinglots;
	}
	
	public Booking bookParkingSpace(Client user, ParkingSpace parkingSpace) {
	
		
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
