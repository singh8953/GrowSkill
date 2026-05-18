package assignment15May;

import java.util.ArrayList;
import java.util.List;

//Method Reference Based Questions
//Question  – Print List Using Method Reference
//Given:
//["A", "B", "C"]
//Print all elements using:
//System.out::println

public class StreamAPIMethodRefernce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>  lst = new ArrayList<String>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		
		lst
		.stream()
		.forEach(System.out:: println);
		
	}
	

}
