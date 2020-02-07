package entitiesTO;

public class EmployeeTO {

	private Integer ID;
	private String name;
	private Double salary;
	
	public EmployeeTO(){
		
	}
	
	public EmployeeTO(Integer iD, String name, Double salary) {
		ID = iD;
		this.name = name;
		this.salary = salary;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public void increaseSalary(double percentage){
		salary+=salary*percentage/100;
	}

	@Override
	public String toString() {
		return "EmployeeTO [ID=" + ID + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
