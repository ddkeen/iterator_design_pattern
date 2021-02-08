public class WishList {

    public static final int MAX_ITEMS = 5;
    private String name;
    private Item[] items;
    private int count = 0;

        public WishList(String name) {
            this.name = name;
            items = new Item[MAX_ITEMS];
        }
      
        public void addItem(String title, String description,  double price) {

            Item item = new Item(title, description, price);
            if (count >= items.length) {
                items = growArray(items);
                items[count] = item;
                count++;
            } else {
                items[count] = item;
                count++;
            }
        }
    
        public WishListIterator createIterator() {
            return new WishListIterator(items);
        }
        
        public double getTotalCost() {
            double totalPrice = 0;
            for (Item item : items) {
                totalPrice += item.getPrice();
            }
            return totalPrice;
        }

        private Item[] growArray(Item[] items) {
            Item[] items2 = new Item[items.length*2];
            for (int i = 0; i<items.length; i++ ) {
                items2[i] = items[i];
            }
            return items2;
        }
}