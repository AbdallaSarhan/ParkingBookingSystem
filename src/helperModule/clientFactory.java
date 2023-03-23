package helperModule;

import userModule.Client;
import userModule.FacultyMember;
import userModule.NonFacultyStaff;
import userModule.Student;
import userModule.Visitor;

public class clientFactory {
	public static Client createClient(String name, String email, String password, String licensePlate) {
		if (name.equalsIgnoreCase("student")) {
			return new Student(name, email, password, licensePlate);
		}
		if (name.equalsIgnoreCase("faculty member")) {
			return new FacultyMember(name, email, password, licensePlate);
		}
		if (name.equalsIgnoreCase("non-faculty staff")) {
			return new NonFacultyStaff(name, email, password, licensePlate);
		}
		if (name.equalsIgnoreCase("visitor")) {
			return new Visitor(name, email, password, licensePlate);
		}
		else
			throw new IllegalArgumentException("Invalid user type" + name);
	}
}
