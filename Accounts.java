package warehouseorderingtrackingsystem;

import java.util.HashMap;
import java.util.Map;

public class Accounts implements OrderConfirmation{
	private Map<Integer,Boolean> customerOrders;
	private Map<Integer,Boolean> purchaseOrders;
	
	
/**
 * class constructor for accounts
 */
	public Accounts(){
		this.customerOrders = new HashMap<Integer, Boolean>();
		this.purchaseOrders = new HashMap<Integer, Boolean>();
	}

	/**
	 * add customer order number to HashMap
	 * @param orderNo
	 */
	public void addCustomerOrder(int orderNo){
		Integer customerOrderNo = new Integer(orderNo);
		this.customerOrders.put(customerOrderNo, false);
	}
	
	/**
	 * add purchase order number to HashMap
	 * @param orderNo
	 */
	public void addPurchaseOrder(int orderNo){
		Integer purchaseOrderNo = new Integer(orderNo);
		this.purchaseOrders.put(purchaseOrderNo, false);
	}
	
	/**
	 * method for is the accounts has received a purchase order
	 */
	@Override
	public boolean receiveOrder(int orderNo) {
		
		Integer purchaseOrderNo = new Integer(orderNo);
		boolean confirmation = false;
		
		
			// if purchase number is in the map and the order is set to false
			
			if (purchaseOrders.containsKey(purchaseOrderNo) && purchaseOrders.containsValue(false)) {
				this.purchaseOrders.replace(purchaseOrderNo, true);
				
				confirmation = true;
			// if purchase number is in the map and the order is set to true	
			} else if (purchaseOrders.containsKey(purchaseOrderNo) && purchaseOrders.containsValue(true)) {
				
				confirmation = true;
			// if purchase number is in the map and the order is set to false
			}
		
			
		return confirmation;
	}
		
	/**
	 * method for is the accounts has received a customer order
	 * @param confirmation
	 * @return confirmation that delivery has been sent
	 */
	public boolean deliveredOrder(int orderNo){
		
		Integer customerOrderNo = new Integer(orderNo);
		boolean confirmation = false;
		
			// if customer number is in the map and the order is set to false
			
			if (customerOrders.containsKey(customerOrderNo) && customerOrders.containsValue(false)) {
				this.customerOrders.replace(customerOrderNo, true);
				
				confirmation = true;
			// if customer number is in the map and the order is set to true	
			} else if (customerOrders.containsKey(customerOrderNo) && customerOrders.containsValue(true)) {
				
				confirmation = true;
			// if customer number is in the map and the order is set to false
			}
		
		return confirmation;
		
	}
	
	/**
	 * finding a customer order using the customer number
	 * @param customerNo
	 * @return
	 */
	public boolean getCustomerOrder(int customerNo){
		Integer cOrder = new Integer(customerNo);
		boolean value = (boolean) this.customerOrders.get(cOrder);
		return value;
			
	}
	
	/**
	 * finding a purchase order using the purchase number
	 * @param customerNo
	 * @return
	 */
	public boolean getPurchaseOrder(int purchaseNo){
		Integer pOrder = new Integer(purchaseNo);
		boolean value = (boolean) this.purchaseOrders.get(pOrder);
		return value;
			
	}

		
}
