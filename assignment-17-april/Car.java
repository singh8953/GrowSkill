package assignment17april;

class Vehicle {
	
	String brand="Hyundai";
	String speed = "120";
    public final void engineType() {
    	System.out.println("FInal Method Engine Type ");
    }
	public void run() {
		System.out.println("Vehicle is running");
	}
}
public class Car extends Vehicle {

	String fuelType ="Petrol";
	static String Company;
	
	Car(){
		super();
		
		System.out.println("Brand:"+ brand);
		System.out.println(" Speed:"+ speed );
		System.out.println(" Fuel Type:"+ fuelType);
     
	}
	
	//This function giving error , since its a final function
//	public void engineType() {
//		System.out.println("Engine Type Method os child class");
//	}
	
	public void run() {
		super.run();
		System.out.println("Car is running smoothly");
	}
	
	
	public static void displayCompany() {
		System.out.println("Company: "+Company);
	}
	
	public void BrandNameManipulation(String brandName) {
		//reveresed
		
		//METHOD 1 using String Builder
		StringBuilder st = new StringBuilder(brandName);
		st.reverse();
		System.out.println(st);
		
		
		//METHOD2 without string Builder
		int len = brandName.length();
		char[] ch = new char[len];
		int k=0;
		System.out.println(len);
		//System.out.println(brandName.charAt(len-1));
		for(int j=len-1; j>=0;j--) {
			ch[k]=brandName.charAt(j);
			System.out.println(ch[k]);
			k++;
		}
		String stNew = new String(ch);
		System.out.println(stNew);
		
		
		
		//replace  OUTPUT >> H*nd**   from Hyundai
//		 String rep1 = brandName.replace('a', '*');
//		 System.out.println(rep1 +" "+ brandName);
		 
		StringBuilder rep = new StringBuilder("Hyundai");
		rep.replace(1, 3, "*");
		rep.replace(4, 6, "**");
		System.out.println(rep);
		 
		
		
		
		
		//check equality
		boolean checkB = brandName.equals("Hyundai");
		boolean checkA = brandName == "Hyundai";
		System.out.println(checkB);
		System.out.println(checkA);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Car c = new Car();
          c.run();
          Car.Company="Samsung";
          Car.displayCompany();
          c.BrandNameManipulation("Hyundai");
          
	}

}
