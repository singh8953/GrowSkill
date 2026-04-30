package assignmetApril26;

public class LongestMatchingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   String longest ="";
	   String[] names = {"ram", "rahul", "ramesh"};
	   String current ="";
       int flag = 0;
       int index= 0;
       String name = names[0];
      
       while(index<name.length()) {
    	   
    	   current = current + name.charAt(index);
    	   for(int j=0;j<names.length;j++) {
    		   String username=names[j];
    		   if(username.startsWith(current)) {
    			   
    		   } else {
    			   flag=1;
    			   break;
    		   }
    	   }
    	   if(flag==0) {
    		   longest=current;
    	   }
    	   index++;
    	   
       }
       
       if(longest.isEmpty())
    	   System.out.println("No Prefix");
       
       System.out.println(longest);
	}

}
