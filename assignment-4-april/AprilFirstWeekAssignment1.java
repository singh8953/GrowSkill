package assignment;

public class AprilFirstWeekAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {4, 2, 7, 2, 9, 1};
			//new int[10];
			
			//find the smallest element in array
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				
			   System.out.println(arr[i]);
			}
			
			System.out.println("Second smallest is >>" + arr[1]);
	}

}
