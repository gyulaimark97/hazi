
public class Employee {

	 private String employeeName;
	 private long salary;
	
	public Employee(String employeeName,long salary) {
		this.salary=salary;
		this.employeeName=employeeName;
		
	}
	
	public Employee(String employeeName) {
		this(employeeName,25000);
	}
	

	// set get 
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	
	
	public void incSalary(long incrase) {
		
		this.salary+=incrase;
	}

	
	public String displayInfo() {
		return "Salary: "+ this.salary + " Name: "+ this.employeeName;
	}
	
	
	public boolean isInSalaryRange(long salaryStart, long salaryEnd) {
		
		if(this.salary>=salaryStart && this.salary<=salaryEnd) {
			return true;
		}
		else 
			return false;
	}
	
	
	
	
	public long getTax() {
		return (long) (this.salary*0.16);
	}
	
	
	
	
	
	
	public boolean hasHigherSalary (Employee employee) {
		
		if(this.salary>employee.salary)
			return true;
		else
			return false;
	}
	
	
}
