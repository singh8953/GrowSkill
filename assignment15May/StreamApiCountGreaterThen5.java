package assignment15May;

import java.util.ArrayList;
import java.util.List;

//Question  – Filter Strings with Length Greater Than 5
//Given:
//["Java", "Automation", "API", "Playwright"]

public class StreamApiCountGreaterThen5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> lst = new ArrayList<String>();
		lst.add("Java");
		lst.add("Automation");
		lst.add("API");
		lst.add("Playwright");
		
		lst
		.stream()
		.filter(s -> (s.length() > 5))
		.forEach(s -> System.out.println(s));
	}

}
