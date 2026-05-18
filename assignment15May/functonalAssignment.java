package assignment15May;



@FunctionalInterface
interface StringToUpperCase
{
	String conversion(String data);
}

public class functonalAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringToUpperCase obj =  (data) -> {
			return data.toUpperCase();
		};
		
		
		System.out.println(obj.conversion("nidhi singh"));
	
	}
	

}
