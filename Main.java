
package warehouseorderingtrackingsystem;

import java.awt.EventQueue;
import java.sql.SQLException;

public class Main {
	
	public static void main(String[] args) throws SQLException {
	//undo commenting to run console interface.
		
		Warehouse w = new Warehouse();
		WarehouseOperative whOp = new WarehouseOperative("root", 123456);
		Console c = new Console(w, whOp);
		
		//c.mainMenu();

		
		NBGardensDB nbgd = new NBGardensDB();
		nbgd.accessDB();
		nbgd.getAllInventoryItems();
		nbgd.insertItemsToInventory(14442, "Big Gnome", "Huge Gnome with a red hat", "A04");
		//used to run the GUI for our warehouse ordering system
		/*	EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run(){
				UserGUI g = new UserGUI();
				g.setVisible(true);
			}
		});*/
	}

}
