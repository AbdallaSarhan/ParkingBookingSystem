package parkingBookingModule;

public class Sensor {

	private boolean isVacant;
	private Booking booking;
	

	public void setCarInfo(Booking booking) {
		
	}
	
	public Booking getCarInfo() {
		return this.booking;
		
	}
	
//	public boolean isVacant() {
//		return isVacant;
//	}
//	
	public boolean getVacancy() {
		return isVacant;
	}
	
//	public void setVacancy(boolean isVacant) {
//		this.setVacant(isVacant);
//	}

	public void setVacant(boolean isVacant) {
		this.isVacant = isVacant;
	}
}
