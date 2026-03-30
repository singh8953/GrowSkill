package java_program;

import java.util.Scanner;

public class digitTranformation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1.	Take a number n 
			2.	Traverse digits from right to left 
			3.	Apply following rules: 
			o	If digit is at odd place  AND digit ≤ 4 → multiply by 2 
			o	If digit is at even place→ replace with 1 
			o	Else keep at it is i.e digit at odd place and >4
			4.	Form a new number from the result 
			👉 Example:
			Input: n = 57243
			Step-by-step:
			Position (right se):
			•	3 (pos 1, odd ≤4) → 6 
			•	4 (2nd place,even) → 1 
			•	2 (3rd , odd place and less than <=4) → 4 
			•	7 (4th place,even) → 1
			•	5 (5th place,odd but is >=5) → 5
			Output: 51416

		 */

		
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
	    int[] arr;
	  
	    String numStr = Long.toString(num);
	    char[] arra= numStr.toCharArray();
	    for(int j =1; j<=arra.length; j++ ) {
	    		if(j%2==0) {
	    			arra[j-1]='1';
	       		} else {
	    			 
	    			char h1 = numStr.charAt(j-1);
	    			int h = h1 -'0';
	    			if (h <= 4) {
	    				int t = h*2;
	    			
	    				char d =  (char) ( t + '0');
	    				arra[j-1]= d;
	    			} //
	    		}	    		
	    }		
	    System.out.println(arra);
	}	

}
