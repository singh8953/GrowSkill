package assignment;

class Person {
	int age;
	String name;
	Person(int age, String name){
	 this.age= age;
	 this.name= name;
	}
	
	
	
}

class Student extends Person	 {
	int marks;
	
	Student(String name , int age, int marks){
	    super(age,name);
	    System.out.println(this.age);	   
		this.marks=marks;
	}
	
	public void display() {
	
		System.out.println( this.name + " " +  this.age + " " + this.marks );
	}
	
}

public class AssignmentAprilSecondWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student p = new Student("Nidhi",37,50);
		p.display();

	}

}
