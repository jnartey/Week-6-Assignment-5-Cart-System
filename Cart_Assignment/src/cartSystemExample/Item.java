package cartSystemExample;

public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private Integer quantity;
    private Integer availableQuatity;
    /**
     * @return the itemName
     */
  //Fill the code here
    
    public Item() {
    	this.setQuantity(1);
    }
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the itemDesc
	 */
	public String getItemDesc() {
		return itemDesc;
	}
	/**
	 * @param itemDesc the itemDesc to set
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	/**
	 * @return the itemPrice
	 */
	public Double getItemPrice() {
		return itemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the availableQuatity
	 */
	public Integer getAvailableQuatity() {
		return availableQuatity;
	}
	/**
	 * @param availableQuatity the availableQuatity to set
	 */
	public void setAvailableQuatity(Integer availableQuatity) {
		this.availableQuatity = availableQuatity;
	}
}
