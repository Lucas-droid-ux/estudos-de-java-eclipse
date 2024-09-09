  package entities;

public class Employee {

	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	
	public Employee() {
		super();
	}


	public Employee(String name, Integer hours) {
		super();
		this.name = name;
		this.hours = hours;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public void payment(double amount) {
		valuePerHour *= amount;
	}
	
}
