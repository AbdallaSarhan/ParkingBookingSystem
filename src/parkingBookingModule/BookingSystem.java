package parkingBookingModule;

import java.util.ArrayList;

import paymentModule.PaymentMethod;
import userModule.Client;
import userModule.FacultyMember;
import userModule.NonFacultyStaff;
import userModule.Visitor;
import userModule.Student;

public class BookingSystem {
	private static ArrayList<ParkingLot> parkinglots = new ArrayList<ParkingLot>();
	private ArrayList<ParkingSpace> availableSpaces = new ArrayList<ParkingSpace>(0);
	private PaymentMethod payment;
	private Booking booking;
	private static final BookingSystem bookingSystem = new BookingSystem();
	

	public static BookingSystem getInstance() {
		return bookingSystem;
	}
	
	private BookingSystem() {
		
	}
	
	public ArrayList<ParkingSpace> getAvailableSpaces(){
		
		if(availableSpaces.size() == 0) {
			searchAvailableSpaces();
		}
		
		return availableSpaces;
	}
	
	public void searchAvailableSpaces() {
		
		for(int i=0; i<parkinglots.size(); i++) {
			ParkingLot currentlot = parkinglots.get(i);
			ParkingSpace[] spaces = currentlot.getParkingSpaces();
			for(int j=0; j<spaces.length; j++) {
				if(spaces[i].isAvailable() == true) {
					availableSpaces.add(spaces[i]);
				}
			}
			}
		
	}
	
	
	public void addParkingLot(ParkingLot parkingLot) {
		this.parkinglots.add(parkingLot);
	}
	
	public ArrayList<ParkingLot> getParkingLots(){
		return this.parkinglots;
	}
	
	public Booking bookParkingSpace(Client user, ParkingSpace parkingSpace, int hoursRequested) {
		//to book a parking space:
			//client must be registered after logging in
			//space must not be occupied
			//space must not be booked by another client (user)
			//requires the cost of an hour (of the type of a client) as the deposit
			//client must provide valid licence plate number
		
		if (user.isLoggedIn() && user.getRegistrationStatus() == true && parkingSpace.isAvailable() == true) {
			parkingSpace.book(user, hoursRequested);
		
			return new Booking(parkingSpace, user.getLicensePlate(), hoursRequested);
		}

		
		throw new IllegalArgumentException();
		
	}
	
	public int payForBooking(Client user, Booking bookingInfo) {
		int rate = 0;
		int price;
		if(user instanceof Student) {
			rate = ((Student)user).getRate();
			}
		else if(user instanceof FacultyMember) {
			rate = ((FacultyMember)user).getRate();
		}
		else if(user instanceof NonFacultyStaff) {
			rate = ((NonFacultyStaff)user).getRate();
		}
		else if(user instanceof Visitor) {
			rate = ((Visitor)user).getRate();
		}
		price = rate * bookingInfo.getBookedHours();
		
		return price;
		// just returns how much they owe rn
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
