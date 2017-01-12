package warehouseorderingtrackingsystem;

public abstract class Person {
String name;

	// constructor
	public Person(String name){
		this.name = name;
	}
	
	/**
	 * gets name from class Person
	 * @return name as a String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * part of template pattern
	 */
	abstract void informAccounts(CustomerOrder orderNo, Accounts accountsMember);
	abstract void informAccounts(PurchaseOrder orderNo, Accounts accountsMember);
	abstract boolean sendPurchaseOrderToSupplier(PurchaseOrder purchaseOrderNo);
	abstract boolean sendCustomerOrderToCustomer(CustomerOrder customerOrder);
		
	//Template method
	public final void updateAccountsForPurchaseOrder(PurchaseOrder purchaseOrder, Accounts accounts){
		/**
		 * the defined order for the pick order task
		 */
		sendPurchaseOrderToSupplier(purchaseOrder);
		informAccounts(purchaseOrder, accounts);
	}
	
	//Template method
	public final void updateAccountsForCustomerOrder(CustomerOrder customerOrder,  Accounts accounts){
		/**
		 * the defined order for the pick order task
		 */
		sendCustomerOrderToCustomer(customerOrder);
		informAccounts(customerOrder, accounts);
	}
	
}
