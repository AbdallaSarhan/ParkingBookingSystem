package userModule;

public class NonFacultyStaff extends Client {
	
	private Management managementTeam;
	public final int RATE = 10;
	
	
	
	public NonFacultyStaff(String name, String email, String password, String licensePlate) {
		super(name, email, password, licensePlate);
	}

	@Override
	public void register() {
		this.isRegistered = true;
		
	}
	

}
