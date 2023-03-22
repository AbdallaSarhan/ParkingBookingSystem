package clientModule;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import parkingBookingModule.Booking;
import parkingBookingModule.BookingSystem;
import parkingBookingModule.ParkingLot;
import parkingBookingModule.ParkingSpace;
import parkingBookingModule.Sensor;
import userModule.*;

public class ParkingBookingSystemClient {
	
	
	public ParkingBookingSystemClient() {
		// Default
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		// text area
		JTextArea welcomeText = new JTextArea("Yorku Parking Booking system");
		welcomeText.setEditable(false);
		// text field and labels
		JLabel name_label = new JLabel("name");
		JTextField name_input = new JTextField(15);
		JLabel password_label = new JLabel("password");
		JTextField password_input = new JTextField(15);
		
		
		// Button
		JButton login_button = new JButton("Login");
		JButton register_button = new JButton("Register");
		
		
		
		
		
		// Panel
		JPanel authentication_buttons_panel = new JPanel();
		authentication_buttons_panel.add(login_button);
		authentication_buttons_panel.add(register_button);
		
		JPanel name_data_panel = new JPanel();
		name_data_panel.add(name_label);
		name_data_panel.add(name_input);
	
		JPanel password_data_panel = new JPanel();
		password_data_panel.add(password_label);
		password_data_panel.add(password_input);
		
		
	
		 
		// add component to frame
		frame.getContentPane().add(BorderLayout.NORTH, welcomeText);
		frame.getContentPane().add(BorderLayout.SOUTH, authentication_buttons_panel);
		frame.getContentPane().add(BorderLayout.CENTER, password_data_panel);
		frame.getContentPane().add(BorderLayout.CENTER, name_data_panel);
	

		
		frame.setVisible(true);
			
	}	
	

	public static void main(String[] args) {
		
//		new ParkingBookingSystemClient();
		
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
		
		manager.addParkingLot();
		
		System.out.println(student1.getAvailableSpaces());
		
		
	
	
 

//		ParkingSpace p = new ParkingSpace(parking, s);
//		ParkingSpace z = new ParkingSpace(parking, s);
//		ParkingSpace c = new ParkingSpace(parking, s);
//		ParkingSpace d = new ParkingSpace(parking, s);
//		ParkingSpace e = new ParkingSpace(parking, s);
//		ParkingSpace f = new ParkingSpace(parking, s);
//		ParkingSpace g = new ParkingSpace(parking, s);
//		
//		ParkingSpace h = new ParkingSpace(parking, s);
//		ParkingSpace i = new ParkingSpace(parking, s);
//	

//		
//		ParkingSpace[] spaces = parking.getParkingSpaces();
		// parkingLot has an array of 100 null spaces
//		System.out.println(spaces);
//		
//		BookingSystem b = new BookingSystem();
//		Management m = new Management("test@gmail.com", "gunther", "123p");
//		m.enableParkingLot(parking);
//		System.out.println(parking.getStatus());
//		m.disableParkingLot(parking);
//		System.out.println(parking.getStatus());
//		m.enableParkingSpace(p);
//		System.out.println(p.getAvailability());
//		m.disableParkingSpace(p);
//		System.out.println(p.getAvailability());
//		m.addParkingLot(parking);
//		System.out.println(b.getParkingLots());
//		

		

		
//		Booking booking = new Booking(parkspace, "BHCG167", 4);
	
//		System.out.println(booking.getStartDate());
		
//		System.out.println(p.getId());
//		System.out.println(c.getId());
//		System.out.println(d.getId());
//		System.out.println(e.getId());
//		System.out.println(f.getId());
//		
		

		

	}

}
