package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class CartSystem extends TheSystem{
    public CartSystem() throws FileNotFoundException {
    }
    public void display() {
      //Fill the code here
    	double total = 0;
    	double subTotal = 0;
    	double tax = 0;
    	int totalQuantity = 0;
    	
    	System.out.printf("%-25s | %-25s | %-15s | %-15s", "Item", "Description", "Quantity", "Sub Total");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------");
		
    	for(Map.Entry<String, Item> item : this.getItemCollection().entrySet()) {
    		subTotal = item.getValue().getQuantity() * item.getValue().getItemPrice();
    		tax = subTotal * 0.05;
    		
    		double subTotalTax = subTotal + tax;
    		total += subTotalTax;
    		totalQuantity += item.getValue().getQuantity();
    		
    		System.out.printf("%-25s | %-25s | %-15s | %-15s", item.getKey(), item.getValue().getItemDesc(), item.getValue().getQuantity(), subTotalTax);
    		System.out.println("");
    	}
    	
    	System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%-25s | %-25s | %-15s | %-15s", "", "", totalQuantity, total);
    	
    }
}
