package assignment;

public class aprilFIrstWeekAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///check array is sorted or not
		//int[] arr = {4, 2, 7, 2, 9, 1};
		int[] arr = {4,7,9,23,67};
		
		
		boolean status =true;;
		//find the smallest element in array
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					status=false;
				}
				
			}
			
		}
		
		System.out.println("Array is SOrted :" + status);

	}

}
