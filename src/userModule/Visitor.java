package userModule;

public class Visitor extends Client {
	
	public final int RATE = 15;

	
	public Visitor(String name, String email, String password, String licensePlate) {
		super(name, email, password, licensePlate);
	}

	@Override
	public void register(String name, String email, String password, String licensePlate) {
	
		
	}
	
}
