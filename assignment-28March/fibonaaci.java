package java_program;

public class fibonaaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //print fibonnaci series
		/*
		 * Write a Java program to:
			1.	Print Fibonacci series up to n terms 
			2.	Stop printing using break if any number in the series becomes greater than 100 
			👉 Example:
			Input: n = 10
			Output: 0 1 1 2 3 5 8 13 21 34 55 89
		 */
		int num = 0;
		int sum = 1;
		while(sum<=100) {
			System.out.println(sum);
			int temp = sum;
			sum = num + sum;
			num = temp;
		    
		}
		
	}

}
