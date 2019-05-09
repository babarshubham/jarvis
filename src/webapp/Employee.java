package webapp;

public class Employee {

	private Integer eid;

	public Employee() {
		super();
	}

	public Employee(Integer eid) {
		super();
		this.eid = eid;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + "]";
	}
	
	
}
