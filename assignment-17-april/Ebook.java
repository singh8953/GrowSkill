package assignment17april;
class book {

	String title;
	String author;
	static String libraryName="City Library";
	//final public String ISBN="abcd"; 
	
	book(String title, String author){
		this.title = title;
		this.author= author;
		System.out.println("Contructor of parent Book");
	}
	
	public void display(){
		System.out.println("Title : " + this.title);
		System.out.println("Author : " + this.author);
	}
	
	public void getDescription() {
		System.out.println("Parent class get Desciption ");
	}
	
	public static void showLibrary() {
		System.out.println( libraryName);
	}
	
}
public class Ebook extends book {

	long fileSize;
	Ebook(String title, String author , long fileSize){
		super(title, author);
		this.fileSize = fileSize;
		System.out.println("FileSize : " + this.fileSize +"MB");
	}
	public void getDescription() {
		System.out.println("Child  class Ebook get Desciption ");
	}
	
	public void CheckString(String titleTemp) {
		
	  String upperNew = titleTemp.toUpperCase();
	  System.out.println(upperNew);
	  System.out.println(titleTemp.length());
	  System.out.println(upperNew.contains("JAVA"));
	  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Ebook b = new Ebook("Atomic Habits","James Clear",5);
       b.display();
       b.getDescription();
       Ebook.showLibrary();
      // b.ISBN="Nids";
       
       b.CheckString("Java Programming");
	}

}

