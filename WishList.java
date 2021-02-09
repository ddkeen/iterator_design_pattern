/**
 * WishList class that holds an array of Items
 * @author ddkeen
 */
public class WishList {

    public static final int MAX_ITEMS = 5;
    private String name;
    private Item[] items;
    private int count = 0;

    /**
     * Wishlist Contructor that sets the name and creates a new Item of length MAX_ITEMS
     * @param name, a String containing the name of the Wishlist
     */
    public WishList(String name) {
        this.name = name;
        items = new Item[MAX_ITEMS];
    }
      
    /**
     * Adds an item to the Wishlist and increments count. If the Wishlist is full, it doubles the size of the Wishlist
     * @param title the String title of the item
     * @param description the String description of the item
     * @param price the double price of the item in dollars and cents
     */
    public void addItem(String title, String description, double price) {
        Item item = new Item(title, description, price);
        if (count >= items.length) {
            items = growArray(items);
        }
        items[count] = item;
        count++;
    }
    
    /**
     * Creates a WishListIterator object
     * @return a new WishListIterator object that contains the items array
     */
    public WishListIterator createIterator() {
        return new WishListIterator(items);
    }
    
    /**
     * Returns the total price of all items in the wishlist
     * @return totalPrice, a double represenation of the total price of all items in the wishlist
     */
    public double getTotalCost() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    /**
     * Doubles the size of the item array but keeps the same elements
     * @param items, the Items array
     * @return items2, the new Items array of double the size
     */
    private Item[] growArray(Item[] items) {
        Item[] items2 = new Item[items.length*2];
        for (int i = 0; i<items.length; i++ ) {
            items2[i] = items[i];
        }
        return items2;
    }
}