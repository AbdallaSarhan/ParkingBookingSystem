package userModule;

public class NonFacultyStaff extends Client {
	
	private Management managmentTeam;
	public final int RATE = 10;
	
	
	
	public NonFacultyStaff(String name, String email, String password, String licensePlate) {
		super(name, email, password, licensePlate);
	}

	@Override
	public void register(String name, String email, String password, String licensePlate) {
		// TODO Auto-generated method stub
		
	}
	

}
