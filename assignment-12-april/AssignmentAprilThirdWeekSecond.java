package assignment;

class Employee {

	int id;
	String name;
	double basicSalary;
	Employee(int id, String name, double basicSalary){
		this.id=id;
		this.name= name;
		this.basicSalary = basicSalary;
		
	}
	
	double calculateSalary() {
		double hra = 0.2 * this.basicSalary;
		double bonus = 0.1* this.basicSalary;
		double tottalSalar= this.basicSalary + hra+ bonus ;
		return tottalSalar;
	}
	
	void display() {
		System.out.println("ID of Employee " + this.id);
		System.out.println("Name of Employee " + this.name);
		System.out.println("Basic Salary of Employee " + this.basicSalary);
		System.out.println("Total Salary of Employee " + this.calculateSalary());
		System.out.println("Total Salary of Employee " + calculateSalary());
	}	
}


public class AssignmentAprilThirdWeekSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(345001, "Nidhi Singh" , 2400000);
		e.display();
				
      
	}

}
