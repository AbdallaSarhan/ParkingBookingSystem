package userModule;

import java.util.ArrayList;

import parkingBookingModule.BookingSystem;
import parkingBookingModule.ParkingLot;
import parkingBookingModule.ParkingSpace;

public class Management extends Account {
	
	// team is static because it belongs to the class rather than a specfic instance (will be shared by all objects)
	private static ArrayList<Management> team = new ArrayList<Management>();
	private BookingSystem bookingSystem;
	
	public Management(String email, String name, String password) {
		super(email, name, password);
	}
	
	public void validateAccount(Client client) {
		// Checks if user is a student or faculty or non Faculty staff and entered valid info
		if(client.isRegistered) {
			
			if(!client.getName().equals("") && !client.getLicensePlate().equals("") && !client.getEmail().equals("")) {
				 client.verify();
				}
		}
		
		
	}
	
	public void addTeamMember(Manager m) {
		team.add(m);
	}
	
	public ArrayList<Management> getTeam(){
		
		return team;
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
