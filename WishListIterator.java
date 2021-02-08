import java.util.Iterator;

public class WishListIterator implements Iterator {
    
    private Item[] items;
	private int position = 0;
	
	public WishListIterator(Item[] items) {
		this.items = items;
	}
	
	public Item next() {
        Item item = items[position];
        if(item == null) {
            return null;
        }
		position++;
		return item;
	}
	
	public boolean hasNext() {
		return !(position >= items.length || items[position] == null);
	}
}
