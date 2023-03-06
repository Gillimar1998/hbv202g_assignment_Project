package hbv202g_LibrarySystem;

public class FacultyMember extends User {

	private String department;
	

	public FacultyMember(String name) {
		super(name);
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}	
	
}
