package userModule;

public class FacultyMember extends Client {
	
	private Management managmentTeam;
	
	public final int RATE = 8;
	
	public FacultyMember(String name, String email, String password, String licensePlate) {
		super(name, email, password, licensePlate);
	}

	@Override
	public void register(String name, String email, String password, String licensePlate) {
		// TODO Auto-generated method stub
		
	}
	

}
