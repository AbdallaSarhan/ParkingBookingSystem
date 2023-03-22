package parkingBookingModule;

public class Sensor {

	private boolean isVacant=true;
	private String carLicensePlate;
	
	
	public void setCarLicensePlate(String licensePlate) {
		
		this.carLicensePlate = licensePlate;
	}
	
	public String getCarInfo() {
		
		return this.carLicensePlate;
	}

	
	public boolean getVacancy() {
		return isVacant;
	}
	

	public void setVacancy(boolean isVacant) {
		this.isVacant = isVacant;
	}
}
