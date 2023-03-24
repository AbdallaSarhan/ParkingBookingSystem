package parkingBookingModule;

import java.util.ArrayList;

import helperModule.Observer;
import paymentModule.Credit;
import paymentModule.Debit;
import paymentModule.Mobile;
import paymentModule.PaymentContext;
import userModule.Client;
import userModule.FacultyMember;
import userModule.NonFacultyStaff;
import userModule.Visitor;
import userModule.Student;

public class BookingSystem implements Observer {
	private static ArrayList<ParkingLot> parkinglots = new ArrayList<ParkingLot>();
	private ArrayList<ParkingSpace> availableSpaces = new ArrayList<ParkingSpace>();

	private Booking booking;
	private static final BookingSystem bookingSystem = new BookingSystem();
	

	public static BookingSystem getInstance() {
		return bookingSystem;
	}
	
	private BookingSystem() {
		
	}
	
	public ArrayList<ParkingSpace> getAvailableSpaces(){
		
		// this will likely be changed to observer and so will not be needed
		// available spaces has all the available parking spaces at the time. 
		// When the state of a parking space changes, the array of available spaces will need to be updated
		
		for(int i=0; i<parkinglots.size(); i++) {
			ParkingLot currentlot = parkinglots.get(i);
			ParkingSpace[] spaces = currentlot.getParkingSpaces();
			for(int j=0; j<spaces.length; j++) {
				if(spaces[i].isAvailable() == true) {
					availableSpaces.add(spaces[i]);
				}
			}
			}
		
		return availableSpaces;
	}
	

	
	
	public void addParkingLot(ParkingLot parkingLot) {
		ParkingSpace[] parkingSpaces = parkingLot.getParkingSpaces();
		for(int i = 0; i< parkingSpaces.length; i++) {
			if(parkingSpaces[i].isAvailable()) {
				availableSpaces.add(parkingSpaces[i]);
			}
		}
		this.parkinglots.add(parkingLot);
	}
	
	public ArrayList<ParkingLot> getParkingLots(){
		return this.parkinglots;
	}
	
	public Booking bookParkingSpace(Client user, ParkingSpace parkingSpace, int hoursRequested)throws IllegalArgumentException {
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
	
	public String payForBooking(Client user, Booking bookingInfo, String paymentMethod) {
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
		
		
		if(paymentMethod == "Mobile") {
			PaymentContext pc = new PaymentContext(new Mobile(), user);
			return pc.pay(price);
		
		}
		else if(paymentMethod == "Credit") {
			PaymentContext pc = new PaymentContext(new Credit(), user);
			return pc.pay(price);
		}
		else if(paymentMethod == "Debit") {
			PaymentContext pc = new PaymentContext(new Debit(), user);
			return pc.pay(price);
		}
		
		return "Unable to Process transcation, please try again.";
	
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

	@Override
	public void updateAvailableSpaces() {
		
	}

}
