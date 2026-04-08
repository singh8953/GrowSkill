package assignment;

public class AprilFirstWeekAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q3. Move All Zeros to End
		int[] arr1= {0,0,0,0,77,0,1,0,0,0};
        int length1 = arr1.length;
	 
        int zero  = findOutZeros(arr1);
		 // System.out.println(zero);
		  int counter1=0;
		  for(int i=0;i<length1;) {
		  	   
		  	  // System.out.println(i);
		  	   for(int j=i;j<arr1.length-1; j++) {
		     		  if(arr1[j]==0) {
		     			  int temp = arr1[j];
		     			  arr1[j]=arr1[j+1];
		     			  arr1[j+1]=temp;
		     		  }
		         }
		  	
		  	   if(arr1[i]!=0) {
		  		   i++;
		  	   }
		  	   
		  	   
		  	   
		  	   //this is very important condition
	            if(i>=(length1-zero)) {
		  		   break;
		  	   }
		  	   
		  
		}
	   	for(int i=0;i<arr1.length; i++) {
	        	System.out.println(arr1[i]);
	    }
	        	
	}
	static int findOutZeros(int arr[]){
		int count=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==0)
				count++;
		}
		return count;
	}

}
