package parkingBookingModule;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Booking {
	
	private int id;
	private String startDate;
	private LocalDateTime endDate;
	private ParkingSpace parkingSpace;
	private String licensePlate;
	
	
	public Booking(String startDate, LocalDateTime endDate, ParkingSpace parkingSpace, String licensePlate) {
	
		this.startDate = startDate;
		this.endDate = endDate;
		this.parkingSpace = parkingSpace;
		this.licensePlate = licensePlate;
		
	}


	public String getLicensePlate() {
		return licensePlate;
	}


	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}


	public LocalDateTime getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}


	public String getStartDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   startDate = dtf.format(now);
		return startDate;
	}

	public int getId() {
		return id;
	}

}
