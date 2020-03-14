package entities;

public class Entities {
 
	private Integer id;
	private String name;
	private Double salary;
	
	public Entities() {
		
	}
	public Entities(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
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
	
	public void increaseSalary(double percentage) {
		salary += salary / 100 * percentage;
	}
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
	
}
