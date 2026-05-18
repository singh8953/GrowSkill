package assignment15May;

@FunctionalInterface
interface reverseString
{
	String reverseString(String data);
}
public class functionalInterfaceToReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseString obj = (String data) -> {
			StringBuilder str1 = new StringBuilder(data);
		    return str1.reverse()+"";
		};
		
		 System.out.println(obj.reverseString("potty"));
		
	}
	
	

}
