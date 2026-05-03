package assignment1may;

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book>
{
	int bookId;
	String bookName;
	int price; 
	
	Book(int bookId , String bookName, int price){
		this.bookId=bookId;
		this.bookName = bookName;
		this.price = price;
	}

	@Override
	public int compareTo(Book o) {
		return this.price - o.price;
	}

}

public class BookManagment   {
	
	
	static ArrayList<Book> lst;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lst = new ArrayList<Book>();
		Book b1 = new Book(101, "Java", 499);
		Book b2 = new Book(102, "Python", 399);
		Book b3 = new Book(103, "SQL", 299);
		Book b4 = new Book(104, "C++", 599);
		//adding books
		lst.add(b1);
		lst.add(b2);
		lst.add(b3);
		lst.add(b4);
		
		
		//displaying books
		 displayList();
		
		System.out.println(" Displaying in ascending order ");
		
		//sorting list based on price in ascending order
		Collections.sort(lst);
		
		//displaying books
		 displayList();
				
		//remove a book with ID 102
		 int IdToRemove =102;
         removeBookOfParticularIndex(IdToRemove);
		
		  //displaying books
		  displayList();
		 
		  
		  //updating price of a Book using book Id
		  int IdToUpdate =103;
		  updatingPrice(IdToUpdate, 349);
		  
		  displayList();
		  
		  
		  System.out.println();
		  FoundBookBYName("Java");
		  System.out.println();
		  displayList();
		 
		
		 
	
	}
	
	public static void displayList() {
		 for(Book b : lst) {
				System.out.println(b.bookId + " " + b.bookName + " " + b.price);
			 }
	}
	
	public static void removeBookOfParticularIndex(int IdToRemove)
	{
		 System.out.println(" After removing Displaying ");
		 int indexToRemove=-1;
		 for(Book b : lst) {
			indexToRemove++;
			if(b.bookId == IdToRemove)
				break;
		 }
		 
		 lst.remove(indexToRemove);
		 
	}
	
	public static void updatingPrice(int BookId, int price) {
		 System.out.println(" Update Price for a Book ID ");
		
		 for(Book b : lst) {
				if(b.bookId == BookId) {
					b.price = price;
				}
					
	     }
		 
		
			 
	}
	
	public static void FoundBookBYName(String NameBook) {
		 for(Book b : lst) {
			
				if(b.bookName.toLowerCase().equals(NameBook.toLowerCase())) {
					System.out.println("Book Found: "+ NameBook);
				}
		  }
	}


}
