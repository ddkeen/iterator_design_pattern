public class Item {
    
    private String title;
	private String description;
	private double price;
 
	public Item(String title, String description, double price) {
		this.title = title;
		this.description = description;
		this.price = price;
	}
  
	public String toString() {
		return "***** " + title + " *****\n" + description + "\nPrice: $" + price;
	}
  
	public void print() {
        System.out.println();
        System.out.println(this.toString());
	}
  
	public double getPrice() {
		return price;
	}
}
