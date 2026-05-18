package assignment15May;

import java.util.ArrayList;
import java.util.List;

public class SortedPrintUsingMethodRefrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		   List<Integer>  lst = new ArrayList<Integer>();
		   lst.add(40);
		   lst.add(10);
		   lst.add(30);
		   lst.add(20);
	    
		   
		   lst.stream()
	          .sorted()
	          .forEach(System.out::println);
		   

	}

}
