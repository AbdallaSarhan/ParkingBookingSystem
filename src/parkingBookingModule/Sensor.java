package parkingBookingModule;

public class Sensor {

	private boolean isVacant=true;
	private String carLicensePlate;
	private ParkingStateContext sensorStateContext;
	private SensorParkingState sensorState = sensorStateContext.getState();
	
	
	public void setCarLicensePlate(String licensePlate) {
		
		this.carLicensePlate = licensePlate;
	}
	
	public String getCarInfo() {
		
		return this.carLicensePlate;
	}

	
	public SensorParkingState getVacancy() {
		return sensorState;
	}
	

	public void setVacancy(boolean vacancy) {
		sensorStateContext.setState(vacancy);
	
	}
}
