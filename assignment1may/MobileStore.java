package assignment1may;

import java.util.ArrayList;
import java.util.Collections;

class Mobile implements Comparable<Mobile> {
	String brand; 
	String model ;
	int price;
	
	public Mobile(String brand, String model, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return o.price - this.price;
	} 

}

public class MobileStore {

	static ArrayList<Mobile> lst;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       lst = new ArrayList<Mobile>();
       
       Mobile b1 = new Mobile("Samsung", "S23" ,70000);
       Mobile b2 = new Mobile("Apple", "iPhone15", 80000);
       Mobile b3 = new Mobile("OnePlus", "12", 60000);
       Mobile b4 = new Mobile("Vivo", "V30", 35000);
       Mobile b5 = new Mobile("Realme", "GT", 30000);
		//adding books
		lst.add(b1);
		lst.add(b2);
		lst.add(b3);
		lst.add(b4);
		lst.add(b5);
		
		displayList();
		
		System.out.println("-----------------------");
		
		Collections.sort(lst);
		
		displayList();
		System.out.println("-----------------------");
		removeExpensiveMobile();
		
		displayList();
		System.out.println("-----------------------");
		
		FoundBookBYName("vivo");
		System.out.println("-----------------------");
		
		updatingPrice("samsung", 68000);
		displayList();
		System.out.println("-----------------------");
		
		
	}
	public static void displayList() {
		 for(Mobile b : lst) {
				System.out.println(b.brand + " " + b.model + " " + b.price);
			 }
	}
	
	public static void removeExpensiveMobile()
	{
		 System.out.println(" After removing Displaying ");	 
		 lst.remove(0);
		 
	}
	
	public static void updatingPrice(String brand, int price) {
		 System.out.println(" Update Price for a Book ID ");
		
		 for(Mobile b : lst) {
				if(b.brand.toLowerCase().equals(brand.toLowerCase())) {
					b.price = price;
				}
					
	     }
		 
		
			 
	}
	
	public static void FoundBookBYName(String BrandName) {
		 for(Mobile b : lst) {
			
				if(b.brand.toLowerCase().equals(BrandName.toLowerCase())) {
					System.out.println("Brand Found: "+ BrandName);
				}
		  }
	}

}
