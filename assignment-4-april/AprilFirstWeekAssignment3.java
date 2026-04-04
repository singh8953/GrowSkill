package assignment;

public class AprilFirstWeekAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q3. Move All Zeros to End
		boolean x=false;
		
		//test for below values
		//int[] arr = {4,7,0,5,23,0,20};		
		//int[] arr = {0,7,0,5,23,0,20};
		int[] arr = {0,0,89,5,23,0,20};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==0) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				
				}				
			}
		
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}

}
