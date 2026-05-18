package assignment15May;

@FunctionalInterface
interface vowels {
	int countVowel(String data);
}
public class functinalInterfaceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		vowels obj = (String data) -> {
			
			char[]  ch = data.toLowerCase().toCharArray();
			int count =0;
		    for(int j=0;j<ch.length;j++) {
		    	
		        char c=ch[j];
		    	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
		    		count++;
		    	}
		    }
		    return count;
	   };
	   
	   System.out.println(obj.countVowel("elephant"));

   }
	
}
