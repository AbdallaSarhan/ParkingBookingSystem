package parkingBookingModule;

import java.time.LocalDateTime;

public class Booking {
	
	private int id;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private ParkingSpace parkingSpace;
	private String licensePlate;
	
	
	public Booking(LocalDateTime startDate, LocalDateTime endDate, ParkingSpace parkingSpace, String licensePlate) {
	
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


	public LocalDateTime getStartDate() {
		return startDate;
	}


	public int getId() {
		return id;
	}

}
