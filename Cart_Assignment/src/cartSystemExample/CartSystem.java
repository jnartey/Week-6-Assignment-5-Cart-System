package cartSystemExample;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class CartSystem extends TheSystem{
    public CartSystem() throws FileNotFoundException {
    }
    public void display() {
      //Fill the code here
    	double total = 0;
    	int totalQuantity = 0;
    	DecimalFormat df = new DecimalFormat("#0.00");
    	
    	if(this.getItemCollection().isEmpty()) {
    		System.out.println("Sub Total: " + 0.0);
    		System.out.println("Tax: " + 0.0);
    		System.out.println("Total: " + 0.0);
    	}else {
    		for(Map.Entry<String, Item> item : this.getItemCollection().entrySet()) {
        		double subTotal = item.getValue().getQuantity() * item.getValue().getItemPrice();
        		double tax = subTotal * 0.05;
        		
        		double subTotalTax = subTotal + tax;
        		total += subTotalTax;
        		totalQuantity += item.getValue().getQuantity();
        		
        		System.out.println(item.getKey() + " " + item.getValue().getItemPrice() + " " + item.getValue().getAvailableQuatity());
        		System.out.println("Sub Total: " + df.format(subTotal));
        		System.out.println("Tax: " + df.format(tax));
        		System.out.println("Total: " + df.format(subTotalTax));
        		System.out.println("");
        	}
    	}
    }
    
    public Item remove(String itemName) {
        Item item = null;
        
      //Fill the code here
        if(this.getItemCollection().containsKey(itemName)) {
        	HashMap<String, Item> updatedCollection = new HashMap<String, Item>(this.getItemCollection());
        	updatedCollection.remove(itemName);
        	this.setItemCollection(updatedCollection);
        	item = this.getItemCollection().get(itemName);
        }
        
        return item;
    }
}
