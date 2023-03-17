package userModule;

import java.util.ArrayList;

import parkingBookingModule.BookingSystem;
import parkingBookingModule.ParkingLot;
import parkingBookingModule.ParkingSpace;

public class Management extends Account {
	private ArrayList<Management> team;
	private BookingSystem bookingSystem;
	
	public Management(String email, String password, String name) {
		super(email, password, name);
	}
	
	public boolean validateAccount(Client client) {
		return false;
	}
	
	public void addParkingLot(ParkingLot parkingLot) {
		//add to array list of parking lots?
	}
	
	public void enableParkingLot(ParkingLot parkingLot) {
		//enable= turn into boolean instead?
	}
	
	public void disableParkingLot(ParkingLot parkingLot) {
		//disable = turn into boolean instead?
	}
	
	public void enableParkingSpace(ParkingSpace parkingSpace) {
		//boolean?
	}
	
	public void disableParkingSpace(ParkingSpace parkingSpace) {
		//boolean
	}
	
}
