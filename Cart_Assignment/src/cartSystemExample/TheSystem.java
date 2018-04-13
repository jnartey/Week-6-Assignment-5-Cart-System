package cartSystemExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class TheSystem {
    private HashMap<String, Item> itemCollection;
    
    protected TheSystem() throws FileNotFoundException {
    	itemCollection = new HashMap<String, Item>();
        //Fill the code here
    	this.initSystem();
    }
    
    public void initSystem() {
    	Path filePath = null;
    	BufferedReader bufferedReader= null;
    	filePath = Paths.get("sample.txt");
		InputStream InputStream;
		String[] lines = null;
		Item item = new Item();
		
        if(getClass().getSimpleName().equals("AppSystem") == true) {
        	try {
    			InputStream = Files.newInputStream(filePath);
    			bufferedReader = new BufferedReader(new InputStreamReader(InputStream));
    			
    			while(bufferedReader.ready()) {
    				lines = bufferedReader.readLine().split("\\s ");
    				item.setItemName(lines[0]);
    				item.setItemDesc(lines[1]);
    				item.setItemPrice(Double.parseDouble(lines[2]));
    				item.setAvailableQuatity(Integer.parseInt(lines[3]));
    				
    				itemCollection.put(item.getItemName(), item);
    			}
    			
    			//itemCollection.forEach((k, v) -> System.out.println("key: " + k + " " + v.getItemName() + " " + v.getItemDesc() + " " + v.getItemPrice() + " " + v.getAvailableQuatity()));
    			
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}finally {
    			
    		}
        }
    }
    
    public HashMap<String, Item> getItemCollection(){
    	//Fill the code here
    	return new HashMap<String, Item>(itemCollection);
    }
    
    public void setItemCollection(HashMap<String, Item> copy ){
    	//Fill the code here
    	this.itemCollection = copy;
    }
    
    public Boolean add(Item item) {
    	//Fill the code here
    	boolean isAvailable = false;
    	if(this.getItemCollection().containsKey(item.getItemName())) {
    		if(this.checkAvailability(item, item.getQuantity())) {
    			isAvailable = false;
    		}
    	}else {
    		
    		itemCollection.put(item.getItemName(), item);
    		this.setItemCollection(itemCollection);
    		//System.out.println("Testing testing");
    		isAvailable = true;
    	}
    	
    	return isAvailable;
    }
    public Item remove(String itemName) {
        Item item = null;
      //Fill the code here
        if(this.getItemCollection().containsKey(itemName)) {
        	this.getItemCollection().remove(itemName);
        	item = this.getItemCollection().get(itemName);
        }
        
        return item;
    }
    
    public Boolean checkAvailability(Item item, Integer current) {
    	//Fill the code here
    	if((item.getQuantity() + current) > item.getAvailableQuatity()) {
    		System.out.println("System is unable to add " + current + " " + item.getItemName());
    		System.out.println("System can only add " + (item.getAvailableQuatity() - item.getQuantity()) + " " + item.getItemName());
    		return false;
    	}else {
    		return true;
    	}
    }
}
