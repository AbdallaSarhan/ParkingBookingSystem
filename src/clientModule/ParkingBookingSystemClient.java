package clientModule;


import java.awt.*;
import javax.swing.*;


import parkingBookingModule.Booking;
import parkingBookingModule.BookingSystem;
import parkingBookingModule.ParkingLot;
import parkingBookingModule.ParkingSpace;
import parkingBookingModule.Sensor;
import userModule.*;



public class ParkingBookingSystemClient {
	
	

	  
	
	public ParkingBookingSystemClient() {
		 // Default
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500,500);
		
		// text area
		JTextArea welcomeText = new JTextArea("Yorku Parking Booking system", 1, 5);
		welcomeText.setFont(new Font("Serif", Font.BOLD, 30));
		welcomeText.setBackground(Color.RED);
		welcomeText.setEditable(false);
		
		// text field and labels

		
		
		// Button
		JButton login_button = new JButton("Login");
		JButton register_button = new JButton("Register");
			
		
		// Panel
		JPanel authentication_buttons_panel = new JPanel();
		authentication_buttons_panel.add(login_button);
		authentication_buttons_panel.add(register_button);
		

		 
		// add component to frame
//		frame.getContentPane().add(BorderLayout.NORTH, welcomeText);
//		frame.getContentPane().add(BorderLayout.SOUTH, authentication_buttons_panel);
//		frame.getContentPane().add(BorderLayout.CENTER, view_panel);
//		frame.getContentPane().add(BorderLayout.CENTER, name_data_panel);
	

		
//		frame.setVisible(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300, 90, 900, 600);
		frame.setTitle("Yorku Parking Booking System");
//		setTitle("Registration Form");

//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
 
        Container c = frame.getContentPane();
        c.setLayout(null);
 
        JLabel title = new JLabel("York Parking Booking");
        title.setFont(new Font("Arial", Font.BOLD, 25));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        title.setBackground(Color.red);
        c.add(title);
 
        JLabel name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
 
        JTextField tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
 
        JLabel pass = new JLabel("Password");
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setSize(100, 20);
        pass.setLocation(100, 150);
        c.add(pass);
 
        JTextField tpass = new JTextField();
        tpass.setFont(new Font("Arial", Font.PLAIN, 15));
        tpass.setSize(190, 20);
        tpass.setLocation(200, 150);
        c.add(tpass);
 
        JLabel client = new JLabel("Client");
        client.setFont(new Font("Arial", Font.PLAIN, 20));
        client.setSize(100, 20);
        client.setLocation(100, 200);
        c.add(client);
 
        JRadioButton student = new JRadioButton("Student");
        student.setFont(new Font("Arial", Font.PLAIN, 15));
        student.setSelected(true);
        student.setSize(120, 20);
        student.setLocation(175, 200);
        c.add(student);
 
        JRadioButton fm = new JRadioButton("Faculty Member");
        fm.setFont(new Font("Arial", Font.PLAIN, 15));
        fm.setSelected(false);
        fm.setSize(125, 20);
        fm.setLocation(250, 200);
        c.add(fm);
        
        JRadioButton nfs = new JRadioButton("NF staff");
        nfs.setFont(new Font("Arial", Font.PLAIN, 15));
        nfs.setSelected(false);
        nfs.setSize(120, 20);
        nfs.setLocation(350, 200);
        c.add(nfs);
 
        JRadioButton v = new JRadioButton("Visitor");
        v.setFont(new Font("Arial", Font.PLAIN, 15));
        v.setSelected(false);
        v.setSize(120, 20);
        v.setLocation(425, 200);
        c.add(v);
 
        ButtonGroup bg = new ButtonGroup();
        bg.add(student);
        bg.add(fm);
        bg.add(nfs);
        bg.add(v);
 
        JButton register = new JButton("Register");
        register.setFont(new Font("Arial", Font.PLAIN, 15));
        register.setSize(100, 20);
        register.setLocation(150, 450);
//        sub.addActionListener(this);
        c.add(register);
 

 
     
        frame.setVisible(true);
			
	}	
	

	
	public static void main(String[] args) {
		

		new ParkingBookingSystemClient();

		
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
		
		
		// display these spaces in gui
		System.out.println(student1.getAvailableSpaces());
		// client chooses one 
		// on event click then call client.bookParkingSpace
		//
		
		
	
 

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
