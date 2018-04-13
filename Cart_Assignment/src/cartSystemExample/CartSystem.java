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
    	DecimalFormat df = new DecimalFormat("#.00");
    	
    	System.out.printf("%-25s | %-25s | %-15s | %-15s", "Item", "Description", "Quantity", "Sub Total");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------");
		
    	for(Map.Entry<String, Item> item : this.getItemCollection().entrySet()) {
    		double subTotal = item.getValue().getQuantity() * item.getValue().getItemPrice();
    		double tax = subTotal * 0.05;
    		
    		double subTotalTax = subTotal + tax;
    		total += subTotalTax;
    		totalQuantity += item.getValue().getQuantity();
    		
    		System.out.printf("%-25s | %-25s | %-15s | %-15s", item.getKey(), item.getValue().getItemDesc(), item.getValue().getQuantity(), df.format(subTotalTax));
    		System.out.println("");
    	}
    	
    	System.out.println("--------------------------------------------------------------------------------");
		System.out.printf("%-25s  %25s  %-15s | %-15s", "", "Total", totalQuantity, df.format(total));
    	
    }
}
