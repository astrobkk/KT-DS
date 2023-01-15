package workshop04;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public Book() {
		
	}
	
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		return (double)this.bookPrice * (100.0-this.bookDiscountRate) / 100.0;
	}
	
	public String getName() {
		return this.bookName;
	}
	
	public int getPrice() {
		return  this.bookPrice;
	}
	
	public double getDiscountRate() {
		return this.bookDiscountRate;
	}
	
}
