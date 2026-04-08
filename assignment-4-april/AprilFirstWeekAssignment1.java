package assignment;

public class AprilFirstWeekAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {4, 4, 7, 2, 9, 45};
			//new int[10];
			
			
			int smallest=arr[0];
			for(int j=1;j<arr.length;j++) {
				if(smallest>arr[j]) {
					smallest=arr[j];
				}
					
			}
			//second smallest
			int secondSmallest=arr[0];
			for(int j=1;j<arr.length;j++) {
				if(arr[j] != smallest)
					if(secondSmallest > arr[j]) {
						
						
					secondSmallest=arr[j];
				}
				
					
			}
			
			
			System.out.println("SMALLEST" + smallest);
			System.out.println("SECONDSMALLEST" + secondSmallest);
	}

}
