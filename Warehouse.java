package warehouseorderingtrackingsystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Warehouse {
	private ArrayList<CustomerOrder> customerOrders;
	private ArrayList<PurchaseOrder> purchaseOrders;
	private ArrayList<Item> inventory;
	
	/**
	 * Class constructor
	 * Initialising ArrayLists
	 */
	public Warehouse(){
		this.customerOrders = new ArrayList<CustomerOrder>();
		this.purchaseOrders = new ArrayList<PurchaseOrder>();
		this.inventory = new ArrayList<Item>();
	}
	
	/**
	 * Method for adding an item to inventory array
	 * @param item
	 */
	public void addItemToInventory(Item item){
		this.inventory.add(item);
	}
	
	/**
	 * Method for removing an item to inventory array
	 * @param item
	 */
	public void removeItemFromInventory(Item item){
		this.inventory.remove(item);
	}
	
	/**
	 * Method for removing item from inventory adding to the customerOrder
	 * @param item
	 */
	public void updateInventory(CustomerOrder customerOrder){
		ArrayList<Item> cOrderItems = customerOrder.getItems();
		for(Item item : cOrderItems){
				this.inventory.remove(item);
			}
		}
	
	/**
	 * Method for updating an inventory when purchaseOrder received
	 * @param item
	 */
	public void updateInventory(PurchaseOrder purchaseOrder){
		ArrayList<Item> pOrderItems = purchaseOrder.getItems();
		for (Item item : pOrderItems) {
			this.inventory.add(item);
		}
		
	}
		
	/**
	 * Method for finding an item by its location
	 * @param location
	 * @return String - the name of the item stored in the location
	 */
	public String findItem(String location){
		
		String itemName = "Empty Location";
		for(int i = 0; i < inventory.size(); i++){
			for (Item aItem : inventory) {
				
				if(aItem.getLocation() == location){
					itemName = this.inventory.get(i).getItemName();
				}
			}
		}
		
		return itemName;
	}
	
	/**
	 * Method for checking if a delivery has been delivered
	 * @param isDelivered
	 * @return boolean - true if stock is delivered
	 */
	public boolean checkStockDelivered(PurchaseOrder pOrder){
		
		boolean confirmation = false;
		
		for(int i = 0; i < purchaseOrders.size(); i++){
			for (PurchaseOrder po : purchaseOrders) {
				if(pOrder.getOrderNo() == po.getOrderNo()){
					if(po.getStatus() == SupplierOrder.RECEIVED){
						confirmation = true;
					}
				}
			}
		}
		
		return confirmation;
	}
	
	/**
	 * adding an item to a purchase order
	 * @param pOrder
	 */
	public void addPurchaseOrder(PurchaseOrder pOrder){
		this.purchaseOrders.add(pOrder);
	}
	
	/**
	 * adding an item to a customer order
	 * @param cOrder
	 */
	public void addCustomerOrder(CustomerOrder cOrder){
		this.customerOrders.add(cOrder);
	}
	
	/**
	 * finding a customer order by order number
	 * @param cOrderNo
	 * @return customer order number
	 */
	public int findCustomerOrder(int cOrderNo){
		int orderNo = -1;
		for(int i = 0; i < customerOrders.size(); i++){
			for (CustomerOrder orderNumber : customerOrders) {
				if(orderNumber.getOrderNo() == cOrderNo){
					orderNo = this.customerOrders.get(i).getOrderNo();
				}
			}
		}
			
		return orderNo;
		
	}
	
	/**
	 * finding a purchase order by order number
	 * @param pOrderNo
	 * @return purchase order number
	 */
	public int findPurchaseOrder(int pOrderNo){
		int orderNo = -1;
		for(int i = 0; i < purchaseOrders.size(); i++){
			for (PurchaseOrder orderNumber : purchaseOrders) {
				if(orderNumber.getOrderNo() == pOrderNo){
					orderNo = this.purchaseOrders.get(i).getOrderNo();
				}
			}
		}
			
		return orderNo;
		
	}
		
	/**
	 * setting stock to delivered once the purchase order arrives
	 * @param pOrder
	 */
	public void setStockDelivered(PurchaseOrder pOrder){
		
		for(int i = 0; i < purchaseOrders.size(); i++){
			for (PurchaseOrder po : purchaseOrders) {
				if(pOrder.getOrderNo() == po.getOrderNo()){
					po.setStatus(SupplierOrder.RECEIVED);
				}
			}
		}
	}
		
	/**
	 * checking the quantity of stock
	 * @param location
	 * @return amount
	 */
	public int stockQuantity(String location){
		int count = 0;
		for (Item item : inventory) {
			if(item.getLocation() == location){
				count += 1;
			}
		}
		
		return count;
	}
	
	/**
	 * attempt at travelling salesman
	 * @param customerOrder
	 * @return prints item location in order
	 */
	public List<String> sortOrder(CustomerOrder customerOrder){
		
		ArrayList<Item> items = customerOrder.getItems();
		List<String> orderedList = new ArrayList<String>();
		for (Item item : items){
					orderedList.add(item.getLocation());
		}
		Collections.sort(orderedList);
		for(String location: orderedList)
		{
			System.out.println("Location : "+location);
		}

		return  orderedList;
		//System.out.println(orderedList);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
