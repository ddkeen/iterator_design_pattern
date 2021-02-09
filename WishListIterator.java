import java.util.Iterator;
/**
 * WishListIterator class that implements Iterator
 * Containes an array of Items to iterate through
 * @author ddkeen
 */
public class WishListIterator implements Iterator {
    
    private Item[] items;
    private int position = 0;
    
    /**
     * WishListIterator constructor to set the items array
     * @param items an array of Item objects
     */
    public WishListIterator(Item[] items) {
	    this.items = items;
    }
    
    /**
     * Iteratros to the next item in the array if there is one and returns it, returns null otherwise
     * @return item, the next item. returns null if there is no next item
     */
    public Item next() {
        Item item = items[position];
        if(item == null) {
            return null;
        }
	position++;
	return item;
    }
    /**
     * Returns whether there are more items to iterate over in the array
     * @return boolean, true if there are more items, false if there are no more items
     */
    public boolean hasNext() {
	    return !(position >= items.length || items[position] == null);
    }
}
