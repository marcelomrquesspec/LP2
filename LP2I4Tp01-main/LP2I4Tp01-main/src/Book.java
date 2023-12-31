//Marcelo Marques Araujo CB3005631

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;

	public Book (String name, Author author ,double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	Book (String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
	      return name;
	   }
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return this.qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
		String book1 = "'" + name + "'" + " by " + author.toString();
		return book1;
	}
} 


