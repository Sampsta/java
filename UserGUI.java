package warehouseorderingtrackingsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class UserGUI extends JFrame{
	PurchaseOrder p = new PurchaseOrder(3, 2, 1);
	CustomerOrder c = new CustomerOrder(3, 2, 1, Status.DESPATCHED);
	Warehouse w = new Warehouse();
	WarehouseOperative wo = new WarehouseOperative("dave", 1);
	Accounts a = new Accounts();
	String status;
	JButton button1, button2, button3, button4, button5, button6, button7;
	/**
	 * opening the main menu of the GUI, using 3 buttons for options (customer order, purchase order, cancel
	 * the buttons bellow have new GUI interfaces in so that new options appear when clicked
	 */
	public UserGUI(){
		setTitle("Main Menu");
		setSize(400, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container container = this.getContentPane();
		container.setLayout(new FlowLayout());

		JPanel panel1 = new JPanel();
		container.add(panel1);
		
		createButtons();
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Moved to customer orders");
				JFrame customer = new JFrame();
				customer.setVisible(true);
				customer.setTitle("Customer order");
				customer.setSize(1000, 500);
				customer.setLocationRelativeTo(null);
				customer.setDefaultCloseOperation(EXIT_ON_CLOSE);
				customer.getContentPane();
				//customer.setLayout(new GridLayout (3,2));
					JPanel panel2 = new JPanel(new GridLayout (3,2));
					customer.add(panel2);
						createCustomerButtons();
						panel2.add(button1);
						panel2.add(button2);
						panel2.add(button3);
						panel2.add(button4);
						panel2.add(button5);
						panel2.add(button6);
						panel2.add(button7);
			}
			
		});
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Moved to purchase orders");
				JFrame purchase = new JFrame();
				purchase.setVisible(true);
				purchase.setTitle("Purchase order");
				purchase.setSize(1000, 500);
				purchase.setLocationRelativeTo(null);
				purchase.setDefaultCloseOperation(EXIT_ON_CLOSE);
				purchase.getContentPane();
					JPanel panel3 = new JPanel(new GridLayout (3,2));
					purchase.add(panel3);
						createPurchaseButtons();
						panel3.add(button1);
						panel3.add(button2);
						panel3.add(button3);
						panel3.add(button4);
						panel3.add(button5);
						panel3.add(button6);
						panel3.add(button7);
			}
			
			
		});
		
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Closed");
				System.exit(0);
				
			}
			
		});
	}
	
	/**
	 * creating the buttons for use in the main menu
	 */
	public void createButtons(){
		button1 = new JButton("Customer orders");
		button2 = new JButton("Purchase orders");
		button3 = new JButton("Cancel");
		
	}
	
	/**
	 * creating the buttons for use in the customer order page
	 * and what each button will run
	 */
	public void createCustomerButtons(){
		button1 = new JButton("Get items requied");
		button2 = new JButton("Update status");
		button3 = new JButton("Send order to customer");
		button4 = new JButton("Inform accounts");
		button5 = new JButton("Find customer order");
		button6 = new JButton("Create customer order");
		button7 = new JButton("Close");
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				System.out.println("The items required are :");
				System.out.println(c.getOrderedItems(2));
			}
			
		});
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				c.setOrderStatus(Status.IN_PROCESS);
				System.out.println("changed the status of the order");
			}
			
		});
		
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				wo.sendCustomerOrderToCustomer(c);
				System.out.println("order sent to customer");
			}
			
		});
		
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				wo.informAccounts(c, a);
				System.out.println("order sent to accounts");
			}
			
		});
		
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				w.findCustomerOrder(2);
				System.out.println("great");
			}
			
		});
		
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				w.addCustomerOrder(c);
				System.out.println("well");
			}
			
		});
	
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				System.exit(0);
			}
			
		});
	}
	
	/**
	 * creating the buttons for use in the purchase order page
	 * and what each button will run
	 */
	public void createPurchaseButtons(){
		button1 = new JButton("Add purchase order");
		button2 = new JButton("Find purchase order");
		button3 = new JButton("Set stock delivered");
		button4 = new JButton("Get ordered items");
		button5 = new JButton("Send order to supplier");
		button6 = new JButton("Inform accounts");
		button7 = new JButton("Close");
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				System.out.println("Add a new purchase order");
				w.addPurchaseOrder(p);
			}
			
		});
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				System.out.println("Check a purchase order");
				w.findPurchaseOrder(2);
			}
			
		});
		
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				System.out.println("Change status of purchase order");
				p.setStatus(SupplierOrder.RECEIVED);
			}
			
		});
		
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				System.out.println("The ordered items are: ");
				p.getOrderedItems(2);
			}
			
		});
		
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				System.out.println("Order sent to supplier");
				wo.sendPurchaseOrderToSupplier(p);
			}
			
		});
		
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				wo.informAccounts(p, a);
				System.out.println("Order sent to accounts");
			}
			
		});
		
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				System.exit(0);
			}
			
		});
	}
}
