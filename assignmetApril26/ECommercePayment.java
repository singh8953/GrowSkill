package assignmetApril26;

abstract class Payment {
	int amount;
	abstract void makePayment();
	
	void paymentDetails() {
		System.out.println("Payment Amount:" + amount);
	}

}

class CreditCardPayment extends Payment {

	@Override
	void makePayment() {
		// TODO Auto-generated method stub
		
		System.out.println("Paid " + this.amount + " using Credit Card ending with 1234");
		
	}
	void setAmount(int amount) {
		this.amount = amount;
	}
	
}

class UPIPayment extends Payment {

	
	@Override
	void makePayment() {
		// TODO Auto-generated method stub
		
		System.out.println("Paid " + this.amount + " using UPI ID: user@upi");
		
	}
	

	
}

public class ECommercePayment {
	
//	Payment Amount: 5000
//	Paid 5000 using Credit Card ending with 1234
//
//	Payment Amount: 1500
//	Paid 1500 using UPI ID: user@upi

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	   	UPIPayment upi  = new UPIPayment();
	   	
	   	CreditCardPayment  credit = new CreditCardPayment();
	   
	   	credit.amount=5000;
	   	credit.paymentDetails();
		credit.makePayment();
	   	
		
		upi.amount=1500;
	 	upi.paymentDetails();
	   	upi.makePayment();
	  
   }
}
