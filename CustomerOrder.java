package warehouseorderingtrackingsystem;

import java.util.ArrayList;


public class CustomerOrder extends Order {
	private int customerId;
	private Status orderStatus;
	private ArrayList<Item> customerItems;
/**
 * Class constructor
 * @param orderId
 * @param orderNo
 * @param customerId
 */
	public CustomerOrder(int orderId, int orderNo, int customerId, Status orderStatus) {
		super(orderId, orderNo);
		this.customerId = customerId;
		this.orderStatus = orderStatus;
		this.customerItems = new ArrayList<Item>();
	}
	
	/** 
	 * gets customer id for class CustomerOrder
	 * @return gets customerId as an Int
	 */
	public int getCustomerId() {
		return customerId;
	}
	
	/**
	 * gets the status of an order
	 * @param customerId 
	 * @return status
	 */
	public Status getOrderStatus(int customerId){
		return orderStatus;
	}
	
	/**
	 * sets the status of an order
	 * @param orderStatus
	 */
	public void setOrderStatus(Status orderStatus){
		this.orderStatus = orderStatus;
	}
	
	/**
	 * add an item to the customer order
	 * @param item
	 */
	@Override
	public void addToOrder(Item item){
		this.customerItems.add(item);
	}
	
	/**
	 * returning order items as a string
	 */
	public String getOrderedItems(int orderNumber) {
		
		String orderList = "";
		for (Item item : customerItems) {
			orderList += item.getItemName() + ",";
		}
			
		return orderList;
	}
	
	/**
	 * getting items from an array
	 * @return items
	 */
	public ArrayList<Item> getItems(){
		return this.customerItems;
	}
}
