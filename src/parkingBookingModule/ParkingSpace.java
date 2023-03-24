package parkingBookingModule;

import helperModule.Subject;
import userModule.Client;

public class ParkingSpace implements Subject{
	// IDref used to reference next parking space id
	private static long IDref = 0;
	private long spaceId;
	private ParkingLot lot;
	private OccupiedParkingState occupiedState = new OccupiedParkingState();
	private EmptyParkingState emptyState = new EmptyParkingState();
	private MaintenanceParkingState maintenanceState = new MaintenanceParkingState();
	private Sensor sensor;
	// There is only one observer at the moment
	private BookingSystem bookingSystem = BookingSystem.getInstance();

	
	
	public ParkingSpace(ParkingLot lot, Sensor sensor) {
		this.IDref = IDref +1;
		this.spaceId = IDref + 1;
		this.lot = lot;
		this.sensor = sensor;
	}
	
	public boolean isAvailable() {
		
		if(sensor.getVacancy() instanceof EmptyParkingState) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void book(Client client, int hoursRequested) {
		
		sensor.setVacancy(occupiedState);
		this.notifyObservers();
		
	}
	
	public void cancelBooking() {
		sensor.setVacancy(emptyState);
		this.notifyObservers();
	}
	
	public void extendBooking() {
		// adds time to endDate 
		// adds hours to hours booked
		// booking.setenddate() need a setter for end date
	}
	
	public long getId() {
		return spaceId;
	}
	
	public void enableSpace() {
		sensor.setVacancy(emptyState);
	}
	
	public void disableSpace() {
		sensor.setVacancy(maintenanceState);
	}
	
	
	public ParkingLot getLot() {

		return this.lot;
	}

	public Sensor getSensor() {
		
		return sensor;
	}
	

	public void setSensor(Sensor sensor) {
		
		this.sensor = sensor;
	}
	
	@Override
	public void attach() {
		// since there is only one observer at the moment, this method is not very neccasary
		
	}

	@Override
	public void detach() {
		// since there is only one observer at the moment, this method is not very neccasary
		
	}

	@Override
	public void notifyObservers() {
		bookingSystem.updateAvailableSpaces(this);
		
	}





}
