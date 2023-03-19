package clientModule;

import userModule.*;

public class ParkingBookingSystemClient {

	public static void main(String[] args) {
		
		Student student1 = new Student("Abdalla", "abdalla1@my.yorku.ca", "AbdallaSSS128", "AB7C43");
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
		
		
		System.out.println(student1.getVerificationStatus());
		
		System.out.println(student1.getRegistrationStatus());
		System.out.println(superManager);
		
		
		

	}

}
