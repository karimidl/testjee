package Entity;

public class Employee {
	private int id;
	private String fname;
	private String lname;
	private String dep;
	public Employee() {
		super();
	}
	public Employee(int id, String fname, String lname, String dep) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dep = dep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	
	

}
