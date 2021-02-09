/**
 * Item class that become the objects in the WishList object's array.
 * Each item has a title, description, and price
 * @author ddkeen
 */
public class Item {
    
    private String title;
	private String description;
	private double price;
 
    /**
     * Item Constructor, sets private instance variables
     * @param title the String title of the item
     * @param description a String description of the item
     * @param price a double price of the item in dollars
     */
public Item(String title, String description, double price) {
	this.title = title;
	this.description = description;
	this.price = price;
}
  
    /**
     * A string representation of the Item
     * @return String, the string representation
     */
	public String toString() {
		return "***** " + title + " *****\n" + description + "\nPrice: $" + price;
    }
    
    /**
     * Prints out the string represenation of the item with proper formatiing
     */
	public void print() {
        System.out.println();
        System.out.println(this.toString());
	}
  
    /**
     * Returns the price of the item
     * @return double, the price of the item in dollars and cents
     */
	public double getPrice() {
		return price;
	}
}
