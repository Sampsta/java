package warehouseorderingtrackingsystem;

import java.util.ArrayList;

public class PurchaseOrder extends Order{
	private int supplierNo;
	private SupplierOrder status;
	private ArrayList<Item> itemsOrdered;


/**
 * Class constructor
 * @param orderId
 * @param orderNo
 * @param supplierNo
 */
	public PurchaseOrder(int orderId, int orderNo, int supplierNo) {
		super(orderId, orderNo);
		this.supplierNo = supplierNo;
		this.status = SupplierOrder.NOT_RECEIVED;
		this.itemsOrdered = new ArrayList<Item>();
	}
	
	/**
	 * gets supplierNo from class purchaseOrder
	 * @return supplierNo as an Int
	 */
	public int getSupplierNo() {
		return supplierNo;
	}

	/**
	 * get the status of the suppliers delivery
	 * @return current status of a delivery
	 */
	public SupplierOrder getStatus() {
		return status;
	}

	/**
	 * update the status of a delivery
	 * @param newStatus
	 */
	public void setStatus(SupplierOrder newStatus) {
		this.status = newStatus;
	}
	
	/**
	 * add an item to the purchase order
	 * @param item
	 */
	@Override
	public void addToOrder(Item item){
		this.itemsOrdered.add(item);
	}

	/**
	 * returning order items as a string
	 */
	@Override
	public String getOrderedItems(int orderNumber) {
		String orderList = "";
		for (Item item : itemsOrdered) {
			orderList += item.getItemName() + ",";
		}
			
		return orderList;
	}

	/**
	 * getting items from an array
	 * @return items
	 */
	public ArrayList<Item> getItems(){
		return this.itemsOrdered;
	}



}
