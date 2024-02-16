package SimpleTask;

public class Task {
	
	private String name;
	private String decriptiom;
	private String duedate;
	
	public Task(String name, String decriptiom, String duedate) {
		super();
		this.name = name;
		this.decriptiom = decriptiom;
		this.duedate = duedate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDecriptiom() {
		return decriptiom;
	}
	public void setDecriptiom(String decriptiom) {
		this.decriptiom = decriptiom;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", decriptiom=" + decriptiom + ", duedate=" + duedate + "]";
	}

}
