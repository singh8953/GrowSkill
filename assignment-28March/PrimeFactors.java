package java_program;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		for(int i = 2; i< num ; i++) {
				if(num%i == 0) {
					boolean checker = checkforPrimeNumber(i);
					if(checker==true)
					    System.out.println(i);				
				}
		}
		
	}
	
	public static boolean checkforPrimeNumber(int num){
		boolean marker = true;
		if(num==2)
			marker=true;
		if( num !=2 && num%2 == 0)
			marker =false;
		else {
			for(int i = 3; i< num ; i=i+2) {				
				if(num%i==0) {
					marker=false;					
				}
			}
		}
		
		if(marker==false)			
			return false;
		   //System.out.println("Not a prime number");
		else
			return true;
			//System.out.println("Yes a prime number");
	}

}
