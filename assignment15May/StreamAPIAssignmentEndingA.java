package assignment15May;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



//Assignment Question
//
//Question  – Filter Names Ending with A
//Given:
//["Aman", "Riya", "Ankit", "Tushar"]
//Print names ending with letter A.


public class StreamAPIAssignmentEndingA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<String>();
		
		

		lst.add("sarupriya");
		lst.add("Riya");
		lst.add("Ankit");
		lst.add("Tushar");
		
	     lst
		.stream()
		.filter(s-> (s.endsWith("A") || s.endsWith("a") ))
		.forEach(s-> System.out.println(s));
		
		

	}

}
