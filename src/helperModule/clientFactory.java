package helperModule;

import userModule.Client;
import userModule.FacultyMember;
import userModule.NonFacultyStaff;
import userModule.Student;
import userModule.Visitor;

public class clientFactory {
	public static Client createClient(String email, String name, String password, String licensePlate) {
		if (name.equalsIgnoreCase("student")) {
			return new Student(email, name, password, licensePlate);
		}
		if (name.equalsIgnoreCase("faculty member")) {
			return new FacultyMember(email, name, password, licensePlate);
		}
		if (name.equalsIgnoreCase("non-faculty staff")) {
			return new NonFacultyStaff(email, name, password, licensePlate);
		}
		if (name.equalsIgnoreCase("visitor")) {
			return new Visitor(email, name, password, licensePlate);
		}
		else
			throw new IllegalArgumentException("Invalid user type" + name);
	}
}
