package assignment15May;

import java.util.ArrayList;
import java.util.List;

class ExpensiveProduct {
	  int id;
	  String productName ;
	  int price;
	  public ExpensiveProduct(int id, String productName, int price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	  }
	  public int getId() {
		return id;
	}
	  public void setId(int id) {
		  this.id = id;
	  }
	  public String getProductName() {
		  return productName;
	  }
	  public void setProductName(String productName) {
		  this.productName = productName;
	  }
	  public int getPrice() {
		  return price;
	  }
	  public void setPrice(int price) {
		  this.price = price;
	  }
	  @Override
	  public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	  }
	  @Override
	  public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	  }

}
public class SortExpensiveProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ExpensiveProduct>  lst = new ArrayList<ExpensiveProduct>();
		lst.add(new ExpensiveProduct(12, "AC", 35400));
		lst.add(new ExpensiveProduct(15, "Washing MAchine", 15400));
		lst.add(new ExpensiveProduct(16, "Refrigerator", 65400));
		lst.add(new ExpensiveProduct(19, "Television", 85400));
		lst.add(new ExpensiveProduct(19, "Bed", 5400));
		
		List<ExpensiveProduct> filterLst = lst
		.stream()
		.filter(s -> s.getPrice() > 10000)
		.toList();
		
		
		filterLst
		.forEach(s -> System.out.println(s.getProductName() + " "+ s.getPrice()));
		
	}

}
