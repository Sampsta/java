package warehouseorderingtrackingsystem;

public class Item {
	private int itemNo;
	private String itemName;
	private String itemDescription;
	private String location;
	private boolean porousWare;
	
	/**
	 * Class constructor
	 * @param itemNo
	 * @param itemName
	 * @param itemDescription
	 * @param location
	 */
	public Item (int itemNo, String itemName, String itemDescription, String location){
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.location = location;
		this.porousWare = false;
	}
	
	/**
	 * gets porousWare from class item
	 * @return true or false depending if item has porousWare
	 */
	public boolean requiresPorousWare() {
		return porousWare;
	}

	/**
	 * sets porousWare for class Item, so will either require or not require porousWare
	 * @param porousWare
	 */
	public void setPorousWare(boolean porousWare) {
		this.porousWare = porousWare;
	}

	/**
	 * gets item number from class item
	 * @return item number as an int
	 */
	public int getItemNo() {
		return itemNo;
	}
	
	/**
	 * gets item name from class item
	 * @return item name as a String
	 */
	public String getItemName() {
		return itemName;
	}
	
	/**
	 * gets item description from class item
	 * @return item description as a String
	 */
	public String getItemDescription() {
		return itemDescription;
	}
	
	/**
	 * sets item description for class item
	 * @return sets new item description as a String
	 */
	public void setItemDescription(String description){
		this.itemDescription = description;
	}
	
	/**
	 * gets item location from class item
	 * @return item location as a String
	 */
	public String getLocation() {
		return location; 
	}
	
	/**
	 * sets item location for class item
	 * @return sets new item location as a String
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
}
