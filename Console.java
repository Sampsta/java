package warehouseorderingtrackingsystem;
import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Console {
	
	/*
	
		Scanner s = new Scanner(System.in);
		PurchaseOrder p = new PurchaseOrder(3, 2, 1);
		CustomerOrder c = new CustomerOrder(3, 2, 1, Status.DESPATCHED);
		Warehouse w = new Warehouse();
		WarehouseOperative wo = new WarehouseOperative("dave", 1);
		Accounts a = new Accounts();
		String status;
		/**
		 * Constructor for console class
		 */
		/*public Console(){
					
		}*/
		
		/**
		 * main options menu for console interface and where each will lead
		 */
		/*public void mainMenu(){
			System.out.println("please select from options");
			System.out.println("option 1, Customer orders");
			System.out.println("option 2, Purchase orders");
			System.out.println("option 3, Cancel");
			switch(s.nextInt()){
			case 1:
				System.out.println("Customer order menu");
				this.pickingMenu();
				break;
				
			case 2:
				System.out.println("Purchase order menu");
				this.purchaseMenu();
				break;
				
			case 3:
				System.out.println("Cancelled");
				break;
			}
		}*/
		
		/**
		 * customer order menu and which methods are run from each
		 */
		/*public void pickingMenu(){
			System.out.println("please select from options");
			System.out.println("option 1, Get items requied");
			System.out.println("option 2, Update status");
			System.out.println("option 3, Send order to customer");
			System.out.println("option 4, Inform accounts");
			System.out.println("option 5, Find customer order");
			System.out.println("option 6, Create customer order");
			System.out.println("option 7, Cancel");
			switch(s.nextInt()){
			case 1:
				System.out.println("The items required are :");
				System.out.println(c.getOrderedItems(2));
				break;
				
			case 2:
				System.out.println("Set the status of the order");
				status = s.nextLine();
				break;
				
			case 3:
				System.out.println("Order sent to customer");
				wo.sendCustomerOrderToCustomer(c);
				break;
				
			case 4:
				System.out.println("Order sent to accounts");
				wo.informAccounts(c, a);
				break;
				
			case 5:
				System.out.println("Find a customer order");
				w.findCustomerOrder(2);
				break;
				
			case 6:
				System.out.println("Add customer order");
				w.addCustomerOrder(c);
				break;
				
			case 7:
				System.out.println("Cancelled");
				break;
			}
		}
		*/
		/**
		 * purchase order menu and which methods are run from each
		 */
	/*	public void purchaseMenu(){
			System.out.println("option 1, Add purchase order");
			System.out.println("option 2, Find purchase order");
			System.out.println("option 3, Set stock delivered");
			System.out.println("option 4, Get ordered items");
			System.out.println("option 5, Send order to supplier");
			System.out.println("option 6, Inform accounts");
			System.out.println("option 7, cancel");
			switch(s.nextInt()){
			case 1:
				System.out.println("Add a new purchase order");
				w.addPurchaseOrder(p);
				break;
				
			case 2:
				System.out.println("Check a purchase order");
				w.findPurchaseOrder(2);
				break;
				
			case 3:
				System.out.println("Change status of purchase order");
				p.setStatus(SupplierOrder.RECEIVED);
				break;
				
			case 4:
				System.out.println("The ordered items are: ");
				p.getOrderedItems(2);
				break;
				
			case 5:
				System.out.println("Order sent to supplier");
				wo.sendPurchaseOrderToSupplier(p);
				break;
				
			case 6:
				System.out.println("Order sent to accounts");
				wo.informAccounts(p, a);
				break;
				
			case 7:
				System.out.println("Cancelled");
				break;
			}
		}
	
	*/
	
	// Chris's attempt
	
	public static Scanner userInput;
	private Warehouse warehouse;
	private WarehouseOperative whOp;
	
	public Console(Warehouse warehouse, WarehouseOperative whOp){
		this.userInput = new Scanner(System.in);
		this.warehouse = warehouse;
		this.whOp = whOp;
	}
	
	public void mainMenu(){
		
		System.out.println("Select a Menu");
		System.out.println("[1] Picking Menu");
		System.out.println("[2] Goods In Menu");
		System.out.println("[3] Admin Menu");
		System.out.println("[4] Exit Application");
		
		switch(userInput.nextInt()){
			case 1:
				this.pickingMenu();
				
				break;
				
			case 2:
				this.goodsInMenu();
				
				break;
				
			case 3:
				this.adminMenu();
				break;
				
			case 4:
				
				break;
		}
		
	}
	
	// menu for warehouse operative to access customer orders 
	public void pickingMenu(){
		System.out.println("Select a Menu");
		System.out.println("[1] Collect Order");
		System.out.println("[2] Confirm Order");
		System.out.println("[3] Show Items of an order");
		System.out.println("[4] Add Porousware to item");
		System.out.println("[5] Return to Main Menun");
		switch(userInput.nextInt()){
			case 1:
				
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
			case 4:
				
				break;
				
			case 5:
				this.mainMenu();
				break;
		}
	}
	
	public void goodsInMenu(){
		System.out.println("Select a Menu");
		System.out.println("[1] Receive Order");
		System.out.println("[2] Update Inventory");
		System.out.println("[3] Return to Main Menu");
		switch(userInput.nextInt()){
			case 1:
				
				
				break;
				
			case 2:
				//whOp.updateAccountsForPurchaseOrder(purchaseOrder, accounts);
				break;
				
			case 3:
				this.mainMenu();
				break;
		}
	}
	
	public void adminMenu(){
		System.out.println("Select a Menu");
		System.out.println("[1] Change Item Location");
		System.out.println("[2] Get EmployeeID");
		System.out.println("[3] Stock Enquiry");
		System.out.println("[4] ");
		System.out.println("[5] ");
		System.out.println("[6] Return to Main Menu");
		switch(userInput.nextInt()){
			case 1:
				
				
				break;
				
			case 2:
				System.out.println(whOp.getName() + " employee number: " + whOp.getEmployeeId());
				this.delay();
				
				break;
				
			case 3:	
				System.out.println("Enter a location");
				String location = userInput.next();
				System.out.println("Location: " + warehouse.findItem(location) + " Qty: " +  warehouse.stockQuantity(location));
				this.delay();
				
			case 4:
				this.mainMenu();
				break;
		}
	}
	
	
	// delays the output by 2 seconds
	public void delay(){
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch(InterruptedException e){
			System.out.println(e);
		} finally {
			System.out.println();
			this.mainMenu();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
