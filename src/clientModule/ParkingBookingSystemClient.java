package clientModule;

import parkingBookingModule.Booking;
import parkingBookingModule.BookingSystem;
import parkingBookingModule.ParkingLot;
import parkingBookingModule.ParkingSpace;
import parkingBookingModule.Sensor;
import userModule.*;

public class ParkingBookingSystemClient {

	public static void main(String[] args) {
		
		// Account constructor takes email then name then password..etc
		// This is to make sure that you can check name and password correctly when logging in
		Student student1 = new Student("abdalla1@my.yorku.ca", "Abdalla", "AbdallaSSS128", "AB7C43");
		SuperManager superManager = SuperManager.getInstance();
		Manager manager = superManager.createManagementAccount("testManager@gmail.com", "manager1", "manager128");
	
		System.out.println(manager.isLoggedIn());
		// need correct credentials to have loggedIn status;
		manager.login("manager1", "manager128");
		System.out.println(manager.isLoggedIn());
		System.out.println(manager.getTeam());
		
		// student must register before they can be verified
		student1.register();
		// All fields must not be blank to be verified
		manager.validateAccount(student1);
		System.out.println(student1.isLoggedIn());
		student1.login("Abdalla", "AbdallaSSS128");
		System.out.println(student1.isLoggedIn());
		
		System.out.println(student1.getVerificationStatus());
		System.out.println(student1.getRegistrationStatus());
		
		FacultyMember prof1 = new FacultyMember("mokhtar@eecs.ca", "Mokhtar", "Mokhtar128", "IA5CC3");
		System.out.println(prof1.getVerificationStatus());
		System.out.println(prof1.getRegistrationStatus());
		prof1.register();
		System.out.println(prof1.getRegistrationStatus());
		manager.validateAccount(prof1);
		System.out.println(prof1.getVerificationStatus());
		
		ParkingLot parking = new ParkingLot();


		ParkingSpace parkspace = new ParkingSpace();

		Sensor s = new Sensor();
		ParkingSpace p = new ParkingSpace(12, parking, s);


		
		ParkingSpace[] spaces = parking.getParkingSpaces();
		// parkingLot has an array of 100 null spaces
		System.out.println(spaces);
		
		BookingSystem b = new BookingSystem();
		Management m = new Management("test@gmail.com", "gunther", "123p");
		m.enableParkingLot(parking);
		System.out.println(parking.getStatus());
		m.disableParkingLot(parking);
		System.out.println(parking.getStatus());
		m.enableParkingSpace(p);
		System.out.println(p.getAvailability());
		m.disableParkingSpace(p);
		System.out.println(p.getAvailability());
		m.addParkingLot(parking);
		System.out.println(b.getParkingLots());
		

		

		
		Booking booking = new Booking(parkspace, "BHCG167", 4);
	
		System.out.println(booking.getStartDate());
		
		

		

	}

}
