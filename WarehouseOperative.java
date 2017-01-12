/**
 * @author Administrator
 * 
 */
package warehouseorderingtrackingsystem;


public class WarehouseOperative extends Person{
private int employeeId;
boolean hasCustomerOrder;

/**
 * Class constructor
 * @param name
 * @param employeeId
 */
	public WarehouseOperative (String name, int employeeId){
		super(name);
		this.employeeId = employeeId;
		this.hasCustomerOrder = false;
			
	}
		
	/**
	 * checking if an employee has an order
	 * @return boolean
	 */
	public boolean isHasCustomerOrder() {
	return hasCustomerOrder;
	}

	/**
	 * assigning an order to the employee
	 * @param newCustomerOrder
	 */
	public void setHasCustomerOrder(boolean newCustomerOrder) {
	this.hasCustomerOrder = newCustomerOrder;
	}
	
	/**
	 * get the current level of stock for an item based on the location
	 * @param location
	 * @return item location as a String
	 */
	public int checkStockLevel(String location){
		return 0;
	}
	
	/**
	 * gets employeeId from class WarehouseOperative
	 * @return employeeId as an Int
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	
	/**
	 * inform accounts when a purchaseOrder is received
	 */
	@Override
	public void informAccounts(PurchaseOrder orderNo, Accounts accountsMember){
		accountsMember.receiveOrder(orderNo.getOrderNo());
	}
	
	/**
	 * inform accounts when a customerOrder is despatched
	 */
	@Override
	public void informAccounts(CustomerOrder orderNo, Accounts accountsMember){
		accountsMember.deliveredOrder(orderNo.getOrderNo());
	}
	
	/**
	 * sends a purchase order to the supplier
	 * @param purchaseOrderNo
	 */
	@Override
	public boolean sendPurchaseOrderToSupplier(PurchaseOrder purchaseOrderNo){
		boolean send = false;
		if(purchaseOrderNo.getOrderNo() != 0 && 
				purchaseOrderNo.getStatus() != SupplierOrder.RECEIVED){
			send = true;
		}
			
		return send;
	}
	/**
	 * sends an order to customer
	 */
	@Override
	public boolean sendCustomerOrderToCustomer(CustomerOrder customerOrder){
		boolean sendOrder = false;
		int customerId = customerOrder.getCustomerId();
		if(customerOrder.getOrderNo() > 0 && customerOrder.getOrderStatus(customerId) == Status.DESPATCHED){
			sendOrder = true;
		}
		return sendOrder;
	}
	
	
	

}
