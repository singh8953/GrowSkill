package assignmetApril26;

public class LongestPrefixSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"ravi", "ravhan","ravul","revesh"};
		boolean flagTobreak = false;
		
		String str = names[0];
		int index=0;
		String longestStr="";
		String currentCheckOfStr="";
		
		
		
		while(index<str.length()) {
			currentCheckOfStr = currentCheckOfStr + str.charAt(index);
			for(int j=1;j<names.length;j++) {
				if(names[j].startsWith(currentCheckOfStr)) {
					
				} else {
					flagTobreak=true;
					break;
				}
			}
			index++;
			if(flagTobreak==true) {
				break;
			}
			longestStr = currentCheckOfStr;
			
		}
		
		if(longestStr.length()==0)
			System.out.println("No Prefix");
		if(flagTobreak==true)
		  System.out.println(longestStr);
		

	}

}
